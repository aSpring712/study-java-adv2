package chat.server.command;

import chat.server.Session;
import chat.server.SessionManager;

import java.io.IOException;
import java.util.List;

/**
 * Exit Command
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-03
 * @version 1.0
 */
public class ExitCommand implements Command {

	private final SessionManager sessionManager;

	public ExitCommand(SessionManager sessionManager) {
		this.sessionManager = sessionManager;
	}

	@Override
	public void execute(String[] args, Session session) throws IOException {
		throw new IOException("exit");
	}
}