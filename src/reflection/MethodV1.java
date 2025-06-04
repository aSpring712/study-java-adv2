package reflection;

import reflection.data.BasicData;

import java.lang.reflect.Method;

/**
 * Method V1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-04
 * @version 1.0
 */
public class MethodV1 {

	public static void main(String[] args) {
		Class<BasicData> helloClass = BasicData.class;

		System.out.println("===== methods() =====");
		Method[] methods = helloClass.getMethods();
		for (Method method : methods) {
			System.out.println("method = " + method);
		}

		System.out.println("===== declaredMethods() =====");
		Method[] declaredMethods = helloClass.getDeclaredMethods();
		for (Method method : declaredMethods) {
			System.out.println("declaredMethod = " + method);
		}
	}
}