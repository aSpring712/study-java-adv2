package was.httpserver;

import static util.MyLogger.log;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Http Server
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-03
 * @version 1.0
 */
public class HttpServer {

	private final ExecutorService es = Executors.newFixedThreadPool(10);
	private final int port;
	private final ServletManager servletManager;

	public HttpServer(int port, ServletManager servletManager) {
		this.port = port;
		this.servletManager = servletManager;
	}

	public void start() throws IOException {
		ServerSocket serverSocket = new ServerSocket(port);
		log("서버 시작 port: " + port);

		while (true) {
			Socket socket = serverSocket.accept();
			es.submit(new HttpRequestHandler(socket, servletManager));
		}
	}
}