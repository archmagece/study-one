package dp_Singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * @author archmagece
 * @since 2017-01-17 02
 * thread-safe 초기에 생성
 */
@Slf4j
public class Singleton0 {
	private static final Singleton0 instance = new Singleton0();
	private Singleton0(){
		System.out.println("생성방지");
	}
	public static Singleton0 getInstance(){
		return instance;
	}
}
