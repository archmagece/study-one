import java.util.Scanner;

/**
 * @author archmagece
 * @since 2017-02-16 00
 */
public class HotSummer {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		scanner.nextLine();

		for(int i=0;i<n;i++){
			int goal = scanner.nextInt();
			scanner.nextLine();
			int aggregate = 0;
			for(String usage : scanner.nextLine().split("\\s")){
				aggregate += Integer.parseInt(usage);
			}
			if(goal>=aggregate){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}
