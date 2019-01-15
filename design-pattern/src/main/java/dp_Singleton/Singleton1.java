package dp_Singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * @author archmagece
 * @since 2017-01-17 02
 */
@Slf4j
public class Singleton1 {
	private static Singleton1 instance;
	private Singleton1(){
		System.out.println("생성방지");
	}
	public static Singleton1 getInstance(){
		if(instance==null){
			instance = new Singleton1();
		}
		return instance;
	}
}
