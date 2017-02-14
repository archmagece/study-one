import java.util.Scanner;

/**
 * @author archmagece
 * @since 2017-02-15 02
 *
4
4 MISSPELL
1 PROGRAMMING
7 CONTEST
3 BALLOON
 */
public class Mispell {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());

		for(int i=0;i<n;i++){
			int indexAt = scanner.nextInt();
			char[] inputCharArr = scanner.nextLine().toCharArray();
			char[] outputCharArr = new char[inputCharArr.length-1];

			int k=0;
			for(int j=0;j<inputCharArr.length;j++){
				if(j==indexAt){
					continue;
				}
				outputCharArr[k++] = inputCharArr[j];
			}
			System.out.println(i+1 + new String(outputCharArr));
		}
	}
//	public static void main(String[] args){
//		Scanner scanner = new Scanner(System.in);
//		int n = scanner.nextLine();
//		scanner.nextLine();
//		StringBuilder sb;
//		for(int i=0;i<n;i++){
//			int indexAt = scanner.nextInt();
//			String inputWord = scanner.nextLine();
//			sb = new StringBuilder();
//			sb.append(inputWord.toCharArray());
//			sb.deleteCharAt(indexAt);
//			System.out.println((i+1)+" "+sb.toString());
//		}
//	}
}
