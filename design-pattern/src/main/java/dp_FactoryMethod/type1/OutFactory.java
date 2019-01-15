package dp_FactoryMethod.type1;

/**
 * @author archmagece
 * @since 2017-01-17 00
 */
public class OutFactory {

	public <T extends Out> T getOut(T clazz){
		return clazz;
	}
}
