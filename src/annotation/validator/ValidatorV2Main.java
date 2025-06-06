package annotation.validator;

import static util.MyLogger.log;

/**
 * Validator V2 Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-04
 * @version 1.0
 */
public class ValidatorV2Main {

	public static void main(String[] args) {
		User user = new User("user1", 0);
		Team team = new Team("", 0);

		try {
			log("== user 검증 ==");
			Validator.validate(user);
		} catch (Exception e) {
			log(e);
		}

		try {
			log("== team 검증 ==");
			Validator.validate(team);
		} catch (Exception e) {
			log(e);
		}
	}
}