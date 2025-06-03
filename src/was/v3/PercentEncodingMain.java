package was.v3;

import java.net.URLDecoder;
import java.net.URLEncoder;
import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * Percent Encoding Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-03
 * @version 1.0
 */
public class PercentEncodingMain {

	public static void main(String[] args) {
		String encode = URLEncoder.encode("가", UTF_8);
		System.out.println("encode = " + encode);

		String decode = URLDecoder.decode(encode, UTF_8);
		System.out.println("decode = " + decode);
	}
}