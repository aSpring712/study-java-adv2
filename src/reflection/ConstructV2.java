package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Construct V2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-04
 * @version 1.0
 */
public class ConstructV2 {

	public static void main(String[] args) throws Exception {
		Class<?> aClass = Class.forName("reflection.data.BasicData");

		Constructor<?> constructor = aClass.getDeclaredConstructor(String.class);
		constructor.setAccessible(true);
		Object instance = constructor.newInstance("hello");
		System.out.println("instance = " + instance);

		Method method1 = aClass.getDeclaredMethod("call");
		method1.invoke(instance);
	}
}