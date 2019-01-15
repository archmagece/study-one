package dp_Builder;

import lombok.Builder;
import lombok.Data;

/**
 * @author archmagece
 * @since 2017-01-18 00
 */
@Data
@Builder
public class Student {
	private String name;
	private String mobile;
	private String email;
}
