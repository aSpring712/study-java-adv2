package was.httpserver;

import java.io.IOException;

/**
 * HTTP Servlet
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-03
 * @version 1.0
 */
public interface HttpServlet {
	void service(HttpRequest request, HttpResponse response) throws IOException;
}