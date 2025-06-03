package was.httpserver;

/**
 * Page Not Found Exception
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-03
 * @version 1.0
 */
public class PageNotFoundException extends RuntimeException {

	public PageNotFoundException(String message) {
		super(message);
	}
}