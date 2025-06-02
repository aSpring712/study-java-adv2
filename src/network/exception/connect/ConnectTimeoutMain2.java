package network.exception.connect;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;

/**
 * Connect Timeout Main2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-02
 * @version 1.0
 */
public class ConnectTimeoutMain2 {

	public static void main(String[] args) throws IOException {
		try {
			Socket socket = new Socket();
			socket.connect(new InetSocketAddress("192.168.1.250", 45678), 1000);
		} catch (SocketTimeoutException e) {
			// java.net.SocketTimeoutException: Connect timed out
			e.printStackTrace();
		}
	}
}