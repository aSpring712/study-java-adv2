package annotation.java;

/**
 * Deprecated Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-04
 * @version 1.0
 */
public class DeprecatedMain {

	public static void main(String[] args) {
		System.out.println("DeprecatedMain.main");
		DeprecatedClass dc = new DeprecatedClass();
		dc.call1();
		dc.call2(); // IDE 경고
		dc.call3(); // IDE 경고(심각)
	}
}