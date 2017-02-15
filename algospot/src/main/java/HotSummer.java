import java.io.*;
import java.util.Scanner;

/**
 * @author archmagece
 * @since 2017-02-16 00
 */
public class HotSummer {
	//120ms
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(input.readLine().trim());

		for(int i=0;i<n;i++){
			int goal = Integer.parseInt(input.readLine().trim());
			int aggregate = 0;
			for(String usage : input.readLine().split("\\s")){
				aggregate += Integer.parseInt(usage);
			}
			if(goal>=aggregate){
				writer.write("YES");
			}else{
				writer.write("NO");
			}
			writer.newLine();
		}
		writer.flush();
	}
//	128ms
//	public static void main(String[] args) throws IOException {
//		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//
//		int n = Integer.parseInt(input.readLine().trim());
//
//		for(int i=0;i<n;i++){
//			int goal = Integer.parseInt(input.readLine().trim());
//			int aggregate = 0;
//			for(String usage : input.readLine().split("\\s")){
//				aggregate += Integer.parseInt(usage);
//			}
//			if(goal>=aggregate){
//				System.out.println("YES");
//			}else{
//				System.out.println("NO");
//			}
//		}
//	}
//	168ms
//	public static void main(String[] args){
//		Scanner scanner = new Scanner(System.in);
//
//		int n = scanner.nextInt();
//		scanner.nextLine();
//
//		for(int i=0;i<n;i++){
//			int goal = scanner.nextInt();
//			scanner.nextLine();
//			int aggregate = 0;
//			for(String usage : scanner.nextLine().split("\\s")){
//				aggregate += Integer.parseInt(usage);
//			}
//			if(goal>=aggregate){
//				System.out.println("YES");
//			}else{
//				System.out.println("NO");
//			}
//		}
//	}
}
