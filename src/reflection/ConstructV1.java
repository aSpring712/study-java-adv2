package reflection;

import java.lang.reflect.Constructor;

/**
 * Construct V1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-04
 * @version 1.0
 */
public class ConstructV1 {

	public static void main(String[] args) throws Exception {
		Class<?> aClass = Class.forName("reflection.data.BasicData");

		System.out.println("===== constructors() =====");
		Constructor<?>[] constructors = aClass.getConstructors();
		for (Constructor<?> constructor : constructors) {
			System.out.println(constructor);
		}

		System.out.println("===== declaredConstructors() =====");
		Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
		for (Constructor<?> constructor : declaredConstructors) {
			System.out.println(constructor);
		}
	}
}