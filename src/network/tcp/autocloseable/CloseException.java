package network.tcp.autocloseable;

/**
 * Close Exception
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-02
 * @version 1.0
 */
public class CloseException extends Exception {

	public CloseException(String message) {
		super(message);
	}
}