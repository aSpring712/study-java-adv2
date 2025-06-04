package annotation.mapping;

import java.lang.reflect.Method;

/**
 * Test Controller Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-04
 * @version 1.0
 */
public class TestControllerMain {

	public static void main(String[] args) {
		TestController testController = new TestController();

		Class<? extends TestController> aClass = testController.getClass();
		for (Method method : aClass.getDeclaredMethods()) {
			SimpleMapping simpleMapping = method.getAnnotation(SimpleMapping.class);
			if (simpleMapping != null) {
				System.out.println("[" + simpleMapping.value() + "] -> " + method);
			}
		}
	}
}