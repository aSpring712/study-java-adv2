package chat.server;

import java.io.IOException;

/**
 * Command Manager
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-03
 * @version 1.0
 */
public interface CommandManager {
	void execute(String totalMessage, Session session) throws IOException;
}