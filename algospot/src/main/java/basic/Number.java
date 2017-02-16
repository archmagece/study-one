package basic;

import java.util.LinkedList;

/**
 * @author archmagece
 * @since 2017-02-13 00
 */
public class Number {
	public static String longToBinary(long value){
		long quotient = value;
		long remainder;
		LinkedList<Character> linkedList = new LinkedList<>();

		while(true){
			remainder = quotient % 2;
			quotient = quotient / 2;

			linkedList.addLast((char)remainder);
			if(quotient<2){
				break;
			}
		}
		return linkedList.toString();
	}
	public static void main(String[] args){
		System.out.println(longToBinary(4));
		System.out.println(Long.toBinaryString(4));

		System.out.println(longToBinary(35));
		System.out.println(Long.toBinaryString(35));
	}
}
