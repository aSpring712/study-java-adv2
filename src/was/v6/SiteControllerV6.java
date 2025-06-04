package was.v6;

import was.httpserver.HttpRequest;
import was.httpserver.HttpResponse;

/**
 * Site Controller V6
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-04
 * @version 1.0
 */
public class SiteControllerV6 {

	public void site1(HttpRequest request, HttpResponse response) {
		response.writeBody("<h1>site1</h1>");
	}

	public void site2(HttpRequest request, HttpResponse response) {
		response.writeBody("<h1>site2</h1>");
	}
}