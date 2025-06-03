package chat.server;

import chat.server.command.ChangeCommand;
import chat.server.command.Command;
import chat.server.command.ExitCommand;
import chat.server.command.JoinCommand;
import chat.server.command.MessageCommand;
import chat.server.command.UsersCommand;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Command Manager V3
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-03
 * @version 1.0
 */
public class CommandManagerV3 implements CommandManager {

	public static final String DELIMITER = "\\|";
	private final Map<String, Command> commands = new HashMap<>();

	public CommandManagerV3(SessionManager sessionManager) {
		commands.put("/join", new JoinCommand(sessionManager));
		commands.put("/message", new MessageCommand(sessionManager));
		commands.put("/change", new ChangeCommand(sessionManager));
		commands.put("/users", new UsersCommand(sessionManager));
		commands.put("/exit", new ExitCommand(sessionManager));
	}

	@Override
	public void execute(String totalMessage, Session session) throws IOException {
		String[] args = totalMessage.split(DELIMITER);
		String key = args[0];

		Command command = commands.get(key);
		if (command == null) {
			session.send("처리할 수 없는 명령어 입니다: " + totalMessage);
			return;
		}
		command.execute(args, session);
	}
}