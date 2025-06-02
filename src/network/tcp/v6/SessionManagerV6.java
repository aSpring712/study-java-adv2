package network.tcp.v6;

import java.util.ArrayList;
import java.util.List;

/**
 * Session Manager V6
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-02
 * @version 1.0
 */

// 동시성 처리
public class SessionManagerV6 {

	private List<SessionV6> sessions = new ArrayList<>();

	public synchronized void add(SessionV6 session) {
		sessions.add(session);
	}

	public synchronized void remove(SessionV6 session) {
		sessions.remove(session);
	}

	public synchronized void closeAll() {
		for (SessionV6 session : sessions) {
			session.close();
		}
		sessions.clear();
	}
}