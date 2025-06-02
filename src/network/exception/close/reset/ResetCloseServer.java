package network.exception.close.reset;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static util.MyLogger.log;

/**
 * Reset Close Server
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-02
 * @version 1.0
 */
public class ResetCloseServer {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(12345);
		Socket socket = serverSocket.accept();
		log("소켓 연결: " + socket);

		socket.close();
		serverSocket.close();
		log("소켓 종료");
	}
}