package dp_FactoryMethod.type1;

import lombok.extern.slf4j.Slf4j;

/**
 * @author archmagece
 * @since 2017-01-17 02
 */
@Slf4j
public class Main {
	public static void main(String[] args){
		OutFactory outFactory = new OutFactory();
		Out out = outFactory.getOut(new FileOut());
		//이렇게 하니까 의미가 없는듯.
		//factory별로 별개의 속성을 갖는 녀석들을 생선하는 형태가 좋겠다
	}
}
