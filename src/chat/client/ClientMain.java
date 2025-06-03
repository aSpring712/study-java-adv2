package chat.client;

import java.io.IOException;

/**
 * Client Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-03
 * @version 1.0
 */
public class ClientMain {

	private static final int PORT = 12345;

	public static void main(String[] args) throws IOException {
		Client client = new Client("localhost", PORT);
		client.start();
	}
}