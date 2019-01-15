package dp_Singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * @author archmagece
 * @since 2017-01-17 02
 */
@Slf4j
public class Singleton4 {
	private volatile static Singleton4 instance;
	private Singleton4(){
		System.out.println("생성방지");
	}
	public static synchronized Singleton4 getInstance(){
		//DCL(Double Checking Locking)이라는데 synchronized 체크의 부하를 걱정해서 그런가
		if(instance==null) {
			synchronized (Singleton4.class) {
				if (instance == null) {
					instance = new Singleton4();
				}
			}
		}
		return instance;
	}
}
