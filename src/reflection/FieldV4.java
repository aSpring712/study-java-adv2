package reflection;

import reflection.data.Team;
import reflection.data.User;

/**
 * Field V4
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-04
 * @version 1.0
 */
public class FieldV4 {

	public static void main(String[] args) throws IllegalAccessException {
		User user = new User("id1", null, null);
		Team team = new Team("team1", null);
		System.out.println("===== before =====");
		System.out.println("user = " + user);
		System.out.println("team = " + team);

		FieldUtil.nullFieldToDefault(user);
		FieldUtil.nullFieldToDefault(team);
		System.out.println("===== after =====");
		System.out.println("user = " + user);
		System.out.println("team = " + team);
	}
}