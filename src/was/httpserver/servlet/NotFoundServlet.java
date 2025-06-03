package was.httpserver.servlet;

import was.httpserver.HttpRequest;
import was.httpserver.HttpResponse;
import was.httpserver.HttpServlet;

/**
 * Not Found Servlet
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-03
 * @version 1.0
 */
public class NotFoundServlet implements HttpServlet {
	@Override
	public void service(HttpRequest request, HttpResponse response) {
		response.setStatusCode(404);
		response.writeBody("<h1>404 페이지를 찾을 수 없습니다.</h1>");
	}
}