package network.exception.close.normal;

import static util.MyLogger.log;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Normal Close Server
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-02
 * @version 1.0
 */
public class NormalCloseServer {

	public static void main(String[] args) throws IOException, InterruptedException {
		ServerSocket serverSocket = new ServerSocket(12345);
		Socket socket = serverSocket.accept();
		log("소켓 연결: " + socket);

		Thread.sleep(1000);
		socket.close();
		log("소켓 종료");
	}
}