package dp_FactoryMethod.type2;

import lombok.extern.slf4j.Slf4j;

/**
 * @author archmagece
 * @since 2017-01-17 02
 */
@Slf4j
public class MQOutFactory implements Factory {
	private static final MQOutFactory factory = new MQOutFactory();
	@Override
	public MQOutFactory getInstance() {
		return factory;
	}

	@Override
	public Out getOut(String input) {
		return null;
	}
}
