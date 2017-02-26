package _implement;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author archmagece
 * @since 2017-02-17 00
 */
public class XhaeNeung {
	static class BidirectionalMap<K,V> {
		Map<K, V> kvMap = new HashMap<K, V>();
		Map<V, K> vkMap = new HashMap<V, K>();

		public BidirectionalMap put(K k, V v){
			kvMap.put(k, v);
			vkMap.put(v, k);
			return this;
		}

		public K getKey(V v){
			return vkMap.get(v);
		}
		public V getVal(K k){
			return kvMap.get(k);
		}
	}
	static BidirectionalMap<Integer, String> mapping = new BidirectionalMap();
	static{
		mapping.put(0, "zero");
		mapping.put(1, "one");
		mapping.put(2, "two");
		mapping.put(3, "three");
		mapping.put(4, "four");
		mapping.put(5, "five");
		mapping.put(6, "six");
		mapping.put(7, "seven");
		mapping.put(8, "eight");
		mapping.put(9, "nine");
	}

	static class Comparator{
		Map<Integer, Map<Character, Integer>> kvCounter = new HashMap<Integer, Map<Character, Integer>>();
		public Comparator put(Integer k, String v){
			kvCounter.put(k, mapping(v));
			return this;
		}

		private Map<Character, Integer> mapping(String v){
			Map<Character, Integer> resultMap = new HashMap<Character, Integer>();
			for(char char0 : v.toCharArray()){
				if(resultMap.containsKey(char0)){
					resultMap.put(char0, resultMap.get(char0)+1);
				}else{
					resultMap.put(char0, 1);
				}
			}
			return resultMap;
		}

		public boolean compare(Integer k, String valueToCompare){
			Map<Character, Integer> map = mapping(valueToCompare);
			System.out.println(kvCounter.get(k));
			System.out.println(map);
			return kvCounter.get(k).equals(map);
		}
	}
	static Comparator comparator = new Comparator();
	static{
		comparator.put(0, "zero");
		comparator.put(1, "one");
		comparator.put(2, "two");
		comparator.put(3, "three");
		comparator.put(4, "four");
		comparator.put(5, "five");
		comparator.put(6, "six");
		comparator.put(7, "seven");
		comparator.put(8, "eight");
		comparator.put(9, "nine");
	}

	public static int calculate(String num0, String operator, String num1){
		if(operator.equals("+")){
			return mapping.getKey(num0) + mapping.getKey(num1);
		}else if(operator.equals("-")){
			return mapping.getKey(num0) - mapping.getKey(num1);
		}else if(operator.equals("*")){
			return mapping.getKey(num0) * mapping.getKey(num1);
		}else{
			//fail
			return -1;
		}
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.nextLine();

		for(int count=0;count<n;count++){
			String num0 = scanner.next();
			String operator = scanner.next();
			String num1 = scanner.next();
			scanner.next();
			String num2 = scanner.next();
			scanner.nextLine();
			if(comparator.compare(calculate(num0, operator, num1), num2)){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}
