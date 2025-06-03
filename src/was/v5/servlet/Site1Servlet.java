package was.v5.servlet;

import was.httpserver.HttpRequest;
import was.httpserver.HttpResponse;
import was.httpserver.HttpServlet;

import java.io.IOException;

/**
 * Site1 Servlet
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-03
 * @version 1.0
 */
public class Site1Servlet implements HttpServlet {
	@Override
	public void service(HttpRequest request, HttpResponse response) throws IOException {
		response.writeBody("<h1>site1</h1>");
	}
}