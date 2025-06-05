package was.v8;

import was.httpserver.HttpRequest;
import was.httpserver.HttpResponse;
import was.httpserver.servlet.annotation.Mapping;

/**
 * Search Controller V8
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-05
 * @version 1.0
 */
public class SearchControllerV8 {

	@Mapping("/search")
	public void search(HttpRequest request, HttpResponse response) {
		String query = request.getParameter("q");

		response.writeBody("<h1>Search</h1>");
		response.writeBody("<ul>");
		response.writeBody("<li>query: " + query + "</li>");
		response.writeBody("</ul>");
	}
}