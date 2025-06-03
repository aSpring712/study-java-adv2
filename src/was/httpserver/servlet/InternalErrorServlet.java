package was.httpserver.servlet;

import was.httpserver.HttpRequest;
import was.httpserver.HttpResponse;
import was.httpserver.HttpServlet;

/**
 * Internal Error Servlet
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-03
 * @version 1.0
 */
public class InternalErrorServlet implements HttpServlet {
	@Override
	public void service(HttpRequest request, HttpResponse response) {
		response.setStatusCode(500);
		response.writeBody("<h1>Internal Error</h1>");
	}
}