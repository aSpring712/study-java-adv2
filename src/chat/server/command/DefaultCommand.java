package chat.server.command;

import chat.server.Session;
import chat.server.SessionManager;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * Default Command
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-03
 * @version 1.0
 */
public class DefaultCommand implements Command {

	@Override
	public void execute(String[] args, Session session) throws IOException {
		session.send("처리할 수 없는 명령어 입니다: " + Arrays.toString(args));
	}
}