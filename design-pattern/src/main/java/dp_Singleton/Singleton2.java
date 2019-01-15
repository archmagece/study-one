package dp_Singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * @author archmagece
 * @since 2017-01-17 02
 */
@Slf4j
public class Singleton2 {
	private static Singleton2 instance;
	private Singleton2(){
		System.out.println("생성방지");
	}
	public static synchronized Singleton2 getInstance(){
		if(instance==null){
			instance = new Singleton2();
		}
		return instance;
	}
}
