import java.util.Scanner;

/**
 * @author archmagece
 * @since 2017-02-15 01
 */
public class Encrypt {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();
		for(int i=0;i<n;i++){
			String input = scanner.nextLine();

			char[] inputCharArr = input.toCharArray();
			StringBuilder sb1 = new StringBuilder();
			StringBuilder sb2 = new StringBuilder();

			for(int j=0;j<inputCharArr.length;j++){
				if(j%2==0){
					sb1.append(inputCharArr[j]);
				}else{
					sb2.append(inputCharArr[j]);
				}
			}
			System.out.println(sb1.append(sb2).toString());
		}
	}
}
