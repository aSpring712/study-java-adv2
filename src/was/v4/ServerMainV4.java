package was.v4;

import java.io.IOException;

/**
 * Server Main V4
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-03
 * @version 1.0
 */
public class ServerMainV4 {

	private static final int PORT = 12345;

	public static void main(String[] args) throws IOException {
		HttpServerV4 server = new HttpServerV4(PORT);
		server.start();
	}
}