package _implement;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author archmagece
 * @since 2017-02-17 00
 */
public class Uri {
	public static Map<Character, String> mapF;
	public static Map<String, Character> mapB;
	static{
		mapF = new HashMap<>();
		mapF.put(' ', "%20");
		mapF.put('!', "%21");
		mapF.put('$', "%24");
		mapF.put('%', "%25");
		mapF.put('(', "%28");
		mapF.put(')', "%29");
		mapF.put('*', "%2a");

		mapB = new HashMap<>();
		mapB.put("20", ' ');
		mapB.put("21", '!');
		mapB.put("24", '$');
		mapB.put("25", '%');
		mapB.put("28", '(');
		mapB.put("29", ')');
		mapB.put("2a", '*');
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();

		for(int i=0;i<n;i++){
			char[] line = scanner.nextLine().toCharArray();

			StringBuilder sb = new StringBuilder();
			for(int j=0;j<line.length;j++){
				if(line[j] == '%'){
					sb.append(mapB.get(""+line[j+1]+line[j+2]));
					j+=2;
				}else{
					sb.append(line[j]);
				}
			}
			System.out.println(sb.toString());
		}
	}
}
