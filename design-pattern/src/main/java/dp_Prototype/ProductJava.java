package dp_Prototype;

import lombok.Data;

/**
 * @author archmagece
 * @since 2017-01-17 03
 */
@Data
public class ProductJava implements Cloneable {
	private String name;
	private String type;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
