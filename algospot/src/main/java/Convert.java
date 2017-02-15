import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author archmagece
 * @since 2017-02-15 23
 */
public class Convert {
	public static Map<String,String> measureMap = new HashMap<>();
	static{
		measureMap.put("kg", "lb");
		measureMap.put("lb", "kg");

		measureMap.put("l", "g");
		measureMap.put("g", "l");
	}
	interface Converter {
		double convert(double value);
	}
	public static Map<String,Converter> convertMap = new HashMap<>();
	static{
		convertMap.put("kg", value -> value * 2.2046);
		convertMap.put("lb", value -> value * 0.4536);

		convertMap.put("l", value -> value * 0.2642);
		convertMap.put("g", value -> value * 3.7854);
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		PrintWriter writer = new PrintWriter(System.out);
		String writerFormat = "%d %.4f %s\n";

		int n = scanner.nextInt();
		scanner.nextLine();
		for(int i=0;i<n;i++){
			double value = scanner.nextDouble();
			String measure = scanner.nextLine().trim();

			writer.format(writerFormat, (i+1), convertMap.get(measure).convert(value), measureMap.get(measure));
			writer.flush();
		}
	}
}
