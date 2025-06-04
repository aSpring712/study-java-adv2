package was.v6;

import was.httpserver.HttpRequest;
import was.httpserver.HttpResponse;

/**
 * Search Controller V6
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-04
 * @version 1.0
 */
public class SearchControllerV6 {

	public void search(HttpRequest request, HttpResponse response) {
		String query = request.getParameter("q");

		response.writeBody("<h1>Search</h1>");
		response.writeBody("<ul>");
		response.writeBody("<li>query: " + query + "</li>");
		response.writeBody("</ul>");
	}
}