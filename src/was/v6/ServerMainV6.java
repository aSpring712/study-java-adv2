package was.v6;

import was.httpserver.HttpServer;
import was.httpserver.HttpServlet;
import was.httpserver.ServletManager;
import was.httpserver.servlet.DiscardServlet;
import was.httpserver.servlet.reflection.ReflectionServlet;
import was.v5.servlet.HomeServlet;

import java.io.IOException;
import java.util.List;

/**
 * Server Main V6
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-04
 * @version 1.0
 */
public class ServerMainV6 {

	private static final int PORT = 12345;

	public static void main(String[] args) throws IOException {
		List<Object> controllers = List.of(new SiteControllerV6(), new SearchControllerV6());
		HttpServlet reflectionServlet = new ReflectionServlet(controllers);

		ServletManager servletManager = new ServletManager();
		servletManager.setDefaultServlet(reflectionServlet);
		servletManager.add("/", new HomeServlet());
		servletManager.add("/favicon.ico", new DiscardServlet());

		HttpServer server = new HttpServer(PORT, servletManager);
		server.start();
	}
}