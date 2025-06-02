package network.exception.connect;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * So Timeout Server
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-02
 * @version 1.0
 */
public class SoTimeoutServer {

	public static void main(String[] args) throws IOException, InterruptedException {
		ServerSocket serverSocket = new ServerSocket(12345);
		Socket socket = serverSocket.accept();

		Thread.sleep(1000000);
	}
}