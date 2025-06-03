package chat.server.command;

import chat.server.Session;
import chat.server.SessionManager;

/**
 * Join Command
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-03
 * @version 1.0
 */
public class JoinCommand implements Command {

	private final SessionManager sessionManager;

	public JoinCommand(SessionManager sessionManager) {
		this.sessionManager = sessionManager;
	}

	@Override
	public void execute(String[] args, Session session) {
		String username = args[1];
		session.setUsername(username);
		sessionManager.sendAll(username + "님이 입장했습니다.");
	}
}