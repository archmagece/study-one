package 탐색;

import java.util.*;

/**
 * @author archmagece
 * @since 2017-03-03
 */
public class NQueen {

	static class Queen{
		int x;
		int y;
		public Queen(int x, int y){
			this.x = x;
			this.y = y;
		}
		@Override
		public boolean equals(Object o) {
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			Queen queen = (Queen) o;
			if (x != queen.x) return false;
			return y == queen.y;
		}
		@Override
		public int hashCode() {
			int result = x;
			result = 31 * result + y;
			return result;
		}
		@Override
		public String toString(){
			StringBuilder sb = new StringBuilder();
			sb.append('(');
			sb.append(x);
			sb.append(',').append(' ');
			sb.append(y);
			sb.append(')');
			return sb.toString();
		}
	}

	static class Field{
		LinkedHashSet<Queen> queenAvailable;
		LinkedHashSet<Queen> queenUsed;
		final int size;
		public Field(int size){
			this.size = size;
			queenAvailable = new LinkedHashSet<>();
			queenUsed = new LinkedHashSet<>();
			for(int i=0;i<size;i++){
				for(int j=0;j<size;j++){
					queenAvailable.add(new Queen(i, j));
				}
			}
		}

		public void put(Queen queen){
			queenUsed.add(queen);
			for(int i=0;i<size;i++){
				queenAvailable.remove(new Queen(queen.x, i));
				queenAvailable.remove(new Queen(i, queen.y));
			}
			queenAvailable.remove(new Queen(queen.x, queen.y));
			int x, y;
			//+,+
			x = queen.x;
			y = queen.y;
			while(true){
				x++;
				y++;
				if(x < 0 || size <= x || y < 0 || size <= y){
					break;
				}
				queenAvailable.remove(new Queen(x, y));
			}
			//+,-
			x = queen.x;
			y = queen.y;
			while(true){
				x++;
				y--;
				if(x < 0 || size <= x || y < 0 || size <= y){
					break;
				}
				queenAvailable.remove(new Queen(x, y));
			}
			//-,+
			x = queen.x;
			y = queen.y;
			while(true){
				x--;
				y++;
				if(x < 0 || size <= x || y < 0 || size <= y){
					break;
				}
				queenAvailable.remove(new Queen(x, y));
			}
			//-,-
			x = queen.x;
			y = queen.y;
			while(true){
				x--;
				y--;
				if(x < 0 || size <= x || y < 0 || size <= y){
					break;
				}
				queenAvailable.remove(new Queen(x, y));
			}
		}

		public Set<Queen> available(){
			return queenAvailable;
		}
	}

	static class AnswerSheet{
		Set<Set<Queen>> answerSheets = new HashSet<>();
		final int fieldSize;

		public AnswerSheet(int fieldSize){
			this.fieldSize = fieldSize;
		}

		public boolean isUsedQueen(Queen queen){
			Iterator<Set<Queen>> itr = answerSheets.iterator();
			boolean used = false;
			while(itr.hasNext()){
				if(itr.next().contains(queen)){
					used = true;
					break;
				}
			}
			return used;
		}

		public void addNewAnswer(Set<Queen> answerSheet){
			if(answerSheet.size() != fieldSize){
				return;
			}
			answerSheets.add(answerSheet);
		}

		public void printOut(){
			System.out.println();
			System.out.println("Print Answer Sheet " + fieldSize);
			System.out.println("Count : " + answerSheets.size());
			Iterator<Set<Queen>> answerSheetItr = answerSheets.iterator();
			int i = 0;
			while(answerSheetItr.hasNext()){
				System.out.println("Answer "+ i++ +" : " + answerSheetItr.next());
			}
		}

	}

	public static void main(String[] args){
//		Scanner scanner = new Scanner(System.in);
//		int n = scanner.nextInt();
//		scanner.nextLine();
		int n = 12;

		for(int i=8;i<n;i++){
			int size = i;
//			int size = scanner.nextInt();
//			scanner.nextLine();

			AnswerSheet answerSheet = new AnswerSheet(size);
			for(int j=0;j<size*size;j++){
				Field field = new Field(size);
				Queen firstQueen = field.available().iterator().next();
				if(answerSheet.isUsedQueen(firstQueen)){
					continue;
				}
				if(run(field, firstQueen, size)) {
					answerSheet.addNewAnswer(field.queenUsed);
				}
			}
			answerSheet.printOut();
		}
	}

	public static boolean run(Field field, Queen queenToPut, int recursiveCount){
		if(recursiveCount == 0){
			if(field.available().size()==0 && field.queenUsed.size() == field.size){
				return true;
			}else{
				return false;
			}
		}
		field.put(queenToPut);
		recursiveCount--;
		if(field.available().size()>0){
			Iterator<Queen> queenIterator = field.available().iterator();
			if(queenIterator.hasNext()){
				while(queenIterator.hasNext() && !run(field, queenIterator.next(), recursiveCount)){

				}
			}
		}
		return false;
	}
}
