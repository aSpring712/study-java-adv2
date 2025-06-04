package annotation.java;

/**
 * Override Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-04
 * @version 1.0
 */
public class OverrideMain {

	static class A {
		public void call() {
			System.out.println("A.call");
		}
	}

	static class B extends A {

//		@Override // 주석 풀면 컴파일 오류 발생
		public void calllll() {
			System.out.println("B.call");
		}
	}

	public static void main(String[] args) {
		A a = new B();
		a.call();
	}
}