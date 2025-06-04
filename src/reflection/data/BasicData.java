package reflection.data;

/**
 * Basic Data
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-03
 * @version 1.0
 */
public class BasicData {

	public String publicField;
	private int privateField;

	public BasicData() {
		System.out.println("BasicData.BasicData");
	}

	private BasicData(String data) {
		System.out.println("BasicData.BasicData: " + data);
	}

	public void call() {
		System.out.println("BasicData.call");
	}

	public String hello(String str) {
		System.out.println("BasicData.hello");
		return str + " hello";
	}

	private void privateMethod() {
		System.out.println("BasicData.privateMethod");
	}

	void defaultMethod() {
		System.out.println("BasicData.defaultMethod");
	}

	protected void protectedMethod() {
		System.out.println("BasicData.protectedMethod");
	}
}