package dp_Prototype;

import lombok.extern.slf4j.Slf4j;

/**
 * @author archmagece
 * @since 2017-01-17 23
 */
@Slf4j
public class PrototypeJavaMain {
	public static void main(String[] args) throws CloneNotSupportedException {
		ProductJava product0 = new ProductJava();
		product0.setName("김똑끼");
		product0.setType("게임할때졸린타입");

		System.out.println(product0.hashCode());
		System.out.println(product0);

		ProductJava product1 = (ProductJava) product0.clone();
		System.out.println(product1.hashCode());
		System.out.println(product1);

		System.out.println("이퀄");
		System.out.println(product0.equals(product1));
	}
}
