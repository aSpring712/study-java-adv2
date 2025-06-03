package chat.server;

import java.io.IOException;

/**
 * Command Manager V1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-03
 * @version 1.0
 */
public class CommandManagerV1 implements CommandManager {

	private final SessionManager sessionManager;

	public CommandManagerV1(SessionManager sessionManager) {
		this.sessionManager = sessionManager;
	}

	@Override
	public void execute(String totalMessage, Session session) throws IOException {
		if (totalMessage.startsWith("/exit")) {
			throw new IOException("exit");
		}

		sessionManager.sendAll(totalMessage);
	}
}