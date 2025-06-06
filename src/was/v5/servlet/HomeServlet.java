package was.v5.servlet;

import was.httpserver.HttpRequest;
import was.httpserver.HttpResponse;
import was.httpserver.HttpServlet;

import java.io.IOException;

/**
 * Home Servlet
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-03
 * @version 1.0
 */
public class HomeServlet implements HttpServlet {
	@Override
	public void service(HttpRequest request, HttpResponse response) throws IOException {
		response.writeBody("<h1>home</h1>");
		response.writeBody("<ul>");
		response.writeBody("<li><a href='/site1'>site1</a></li>");
		response.writeBody("<li><a href='/site2'>site2</a></li>");
		response.writeBody("<li><a href='/search?q=hello'>검색</a></li>");
		response.writeBody("</ul>");
	}
}