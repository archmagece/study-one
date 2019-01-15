package dp_FactoryMethod.type2;

/**
 * @author archmagece
 * @since 2017-01-17 00
 */
public interface Factory {
	Factory getInstance();
	Out getOut(String input);
}
