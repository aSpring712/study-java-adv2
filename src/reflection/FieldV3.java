package reflection;

import reflection.data.Team;
import reflection.data.User;

/**
 * Field V3
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-04
 * @version 1.0
 */
public class FieldV3 {

	public static void main(String[] args) {
		User user = new User("id1", null, null);
		Team team = new Team("team1", null);
		System.out.println("===== before =====");
		System.out.println("user = " + user);
		System.out.println("team = " + team);

		if (user.getId() == null) {
			user.setId(" ");
		}
		if (user.getName() == null) {
			user.setName(" ");
		}
		if (user.getAge() == null) {
			user.setAge(0);
		}

		if (team.getId() == null) {
			team.setId(" ");
		}
		if (team.getName() == null) {
			team.setName(" ");
		}

		System.out.println("===== after =====");
		System.out.println("user = " + user);
		System.out.println("team = " + team);
	}
}