package chat.server.command;

import chat.server.Session;

import java.io.IOException;

/**
 * Command
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-03
 * @version 1.0
 */
public interface Command {
	void execute(String[] args, Session session) throws IOException;
}