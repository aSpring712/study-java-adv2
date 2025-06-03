package was.v3;

import java.io.IOException;

/**
 * Server Main V3
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-03
 * @version 1.0
 */
public class ServerMainV3 {

	private static final int PORT = 12345;

	public static void main(String[] args) throws IOException {
		HttpServerV3 server = new HttpServerV3(PORT);
		server.start();
	}
}