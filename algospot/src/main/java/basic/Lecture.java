package basic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @author archmagece
 * @since 2017-02-15 01
 *
 * https://algospot.com/judge/problem/read/LECTURE
 *
5
abbaaccb
dddcccbbbaaa
geegeegeegeebabybabybaby
oh
azba
 */
public class Lecture {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		for(int i=0;i<n;i++){
			String fullString = scanner.nextLine();
			char[] charArr = fullString.toCharArray();
			List<char[]> intArr = new ArrayList<>(charArr.length/2);
			for(int j=0;j<charArr.length/2;j++){
				intArr.add(new char[]{charArr[j*2], charArr[j*2+1]});
			}
//			intArr.sort(Comparator.comparingInt(o2 -> (o2[0] + o2[1])));
//			intArr.sort((o1, o2) -> (o1[0] + o1[1]) - (o2[0] + o2[1]));
//			intArr.sort(new Comparator<char[]>() {
//				@Override
//				public int compare(char[] o1, char[] o2) {
//					return (o1[0] + o1[1]) - (o2[0] + o2[1]) ;
//				}
//			});
			intArr.sort(new Comparator<char[]>() {
				@Override
				public int compare(char[] o1, char[] o2) {
					return o1[1]-o2[1];
				}
			});
			intArr.sort(new Comparator<char[]>() {
				@Override
				public int compare(char[] o1, char[] o2) {
					return o1[0]-o2[0];
				}
			});
			StringBuilder sb = new StringBuilder();
			for(int j=0;j<intArr.size();j++){
				char[] charArr2 = intArr.get(j);
				sb.append(charArr2[0]).append(charArr2[1]);
			}
			System.out.println(sb.toString());
		}
	}
}
