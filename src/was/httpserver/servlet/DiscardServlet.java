package was.httpserver.servlet;

import was.httpserver.HttpRequest;
import was.httpserver.HttpResponse;
import was.httpserver.HttpServlet;

/**
 * Discard Servlet
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-03
 * @version 1.0
 */
public class DiscardServlet implements HttpServlet {
	@Override
	public void service(HttpRequest request, HttpResponse response) {
		// empty
	}
}