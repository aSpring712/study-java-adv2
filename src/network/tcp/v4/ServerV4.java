package network.tcp.v4;

import static util.MyLogger.log;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Server V4
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-02
 * @version 1.0
 */
public class ServerV4 {

	private static final int PORT = 12345;

	public static void main(String[] args) throws IOException {
		log("서버 시작");
		ServerSocket serverSocket = new ServerSocket(PORT);
		log("서버 소켓 시작 - 리스닝 포트: " + PORT);

		while (true) {
			Socket socket = serverSocket.accept(); // 블로킹
			log("소켓 연결: " + socket);

			SessionV4 session = new SessionV4(socket);
			Thread thread = new Thread(session);
			thread.start();
		}
	}
}