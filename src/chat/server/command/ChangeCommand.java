package chat.server.command;

import chat.server.Session;
import chat.server.SessionManager;

/**
 * Change Command
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-03
 * @version 1.0
 */
public class ChangeCommand implements Command {

	private final SessionManager sessionManager;

	public ChangeCommand(SessionManager sessionManager) {
		this.sessionManager = sessionManager;
	}

	@Override
	public void execute(String[] args, Session session) {
		String changeName = args[1];
		sessionManager.sendAll(session.getUsername() + "님이 " + changeName + "로 이름을 변경했습니다.");
		session.setUsername(changeName);
	}
}