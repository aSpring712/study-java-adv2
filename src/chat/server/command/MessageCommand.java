package chat.server.command;

import chat.server.Session;
import chat.server.SessionManager;

/**
 * Message Command
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-03
 * @version 1.0
 */
public class MessageCommand implements Command {

	private final SessionManager sessionManager;

	public MessageCommand(SessionManager sessionManager) {
		this.sessionManager = sessionManager;
	}

	@Override
	public void execute(String[] args, Session session) {
		String message = args[1];
		sessionManager.sendAll("[" + session.getUsername() + "] " + message);
	}
}