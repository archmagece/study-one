package dp_Singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * @author archmagece
 * @since 2017-01-17 02
 */
@Slf4j
public class Singleton3 {
	private static Singleton3 instance;
	private Singleton3(){
		System.out.println("생성방지");
	}
	public static synchronized Singleton3 getInstance(){
		synchronized (Singleton3.class){
			if(instance==null){
				instance = new Singleton3();
			}
		}
		return instance;
	}
}
