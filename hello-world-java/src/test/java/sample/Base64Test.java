package sample;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Base64Test {
	//given global
	private static final String source = "username:password";

	//given each
	@Before
	public void before(){
		System.out.println(source);
	}

	// 1
	// java.util.Base64
	@Test
	public void base64_javautil() {
		//when
		byte[] encoded = java.util.Base64.getEncoder().encode(source.getBytes());
		System.out.println(new String(encoded));

		byte[] decoded = java.util.Base64.getDecoder().decode(encoded);
		System.out.println(new String(decoded));

		//then
		System.out.println(source.equals(new String(decoded)));
		Assert.assertNotEquals(source, new String(encoded));
		Assert.assertEquals(source, new String(decoded));
	}

	// 2
	// org.apache.commons.codec.binary.Base64
	@Test
	public void base64_apache_commons_codec(){
		//when
		byte[] encoded = org.apache.commons.codec.binary.Base64.encodeBase64(source.getBytes());
		System.out.println(new String(encoded));

		byte[] decoded = org.apache.commons.codec.binary.Base64.decodeBase64(encoded);
		System.out.println(new String(decoded));

		//then
		System.out.println(source.equals(new String(decoded)));
		Assert.assertNotEquals(source, new String(encoded));
		Assert.assertEquals(source, new String(decoded));
	}

	// 3
	// org.springframework.util.Base64Utils
	@Test
	public void base64_spring_util(){
		//when
		byte[] encoded = org.springframework.util.Base64Utils.encode(source.getBytes());
		System.out.println(new String(encoded));

		byte[] decoded = org.springframework.util.Base64Utils.decode(encoded);
		System.out.println(new String(decoded));

		//then
		System.out.println(source.equals(new String(decoded)));
		Assert.assertNotEquals(source, new String(encoded));
		Assert.assertEquals(source, new String(decoded));
	}

}
