package was.v3;

import static util.MyLogger.log;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * HTTP Server V3
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-03
 * @version 1.0
 */
public class HttpServerV3 {

	private final ExecutorService es = Executors.newFixedThreadPool(10);
	private final int port;

	public HttpServerV3(int port) {
		this.port = port;
	}

	public void start() throws IOException {
		ServerSocket serverSocket = new ServerSocket(port);
		log("서버 시작 port: " + port);

		while (true) {
			Socket socket = serverSocket.accept();
			es.submit(new HttpRequestHandlerV3(socket));
		}
	}
}