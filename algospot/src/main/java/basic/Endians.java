package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author archmagece
 * @since 2017-02-12 13
 *
 * 00010010 00110100 01010110 01111000 (in an Blefuscu computer)
 * 01111000 01010110 00110100 00010010 (in an Lilliput computer)
 */
public class Endians {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		List<Long> params = new ArrayList<>(count);
		for(int i=0;i<count;i++){
			long input = scanner.nextLong();
//			System.out.println("index "+ i + "  "+input);
			params.add(input);
		}
//		System.out.println();
//		System.out.println();
//		System.out.println();

		//call loop
		for(long param : params){
//			System.out.println("============");
			Numbers numbers = new Numbers(param);
//			System.out.println(param);
//			System.out.println(numbers.toString());
//			System.out.println(numbers.toLong());
			numbers.convert();
//			System.out.println(numbers.toString());
			System.out.println(numbers.toLong());
		}
	}

//	2018915346
//	1
//	100000
//	4294967295
	static class Numbers {
		char[][] parts = new char[4][8];
		boolean orderForward = true;

		public Numbers(long value){
			char[] binary32 = Long.toBinaryString(value).toCharArray();
			int binaryLength = binary32.length;
			int currentPart = 0;
			int currentBinary = 0;

			for(int i=0;i<parts.length;i++){
				for(int j=0;j<parts[i].length;j++){
					if(currentPart++ < 32 - binaryLength){
						parts[i][j] = '0';
					}else {
						parts[i][j] = binary32[currentBinary++];
					}
				}
			}
		}

		public void convert(){
			orderForward = orderForward ? false : true;
		}

		public long toLong(){
			return Long.parseLong(toString(), 2);
		}

		@Override
		public String toString(){
			int length = parts.length;
			StringBuilder sb = new StringBuilder();
			for(int i=0;i<length;i++){
				if(orderForward){
					sb.append(parts[i]);
				}else{
					sb.append(parts[parts.length-1 - i]);
				}
			}
			return sb.toString();
		}
	}

}
