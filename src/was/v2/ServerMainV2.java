package was.v2;

import was.v1.HttpServerV1;

import java.io.IOException;

/**
 * Server Main V2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-03
 * @version 1.0
 */
public class ServerMainV2 {

	private static final int PORT = 12345;

	public static void main(String[] args) throws IOException {
		HttpServerV1 server = new HttpServerV1(PORT);
		server.start();
	}
}