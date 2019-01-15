package dp_Prototype;

import lombok.Data;

/**
 * @author archmagece
 * @since 2017-01-17 23
 */
@Data
public class PrototypeNogadaImpl implements ProductNogada<PrototypeNogadaImpl>{
	private String name;
	private String type;

	@Override
	public PrototypeNogadaImpl clone() {
		PrototypeNogadaImpl obj = new PrototypeNogadaImpl();
		obj.setName(this.name);
		obj.setType(this.type);
		return obj;
	}
}
