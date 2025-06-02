package network.tcp.autocloseable;

/**
 * Resource Close Main V3
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-02
 * @version 1.0
 */
public class ResourceCloseMainV3 {

	public static void main(String[] args) {
		try {
			logic();
		} catch (CallException e) {
			System.out.println("CallException 예외 처리");
			e.printStackTrace();
		} catch (CloseException e) {
			System.out.println("CloseException 예외 처리");
			e.printStackTrace();
		}
	}

	private static void logic() throws CallException, CloseException {
		ResourceV1 resource1 = null;
		ResourceV1 resource2 = null;

		try {
			resource1 = new ResourceV1("resource1");
			resource2 = new ResourceV1("resource2");

			resource1.call();
			resource2.callEx(); // CallException
		} catch (CallException e) {
			System.out.println("ex: " + e);
			throw e; // CallException 다시 던짐
		} finally {
			if (resource2 != null) {
				try {
					resource2.closeEx(); // CloseException 발생!
				} catch (CloseException e) {
					// close()에서 발생한 예외는 버린다. 필요하면 로깅 정도
					System.out.println("close ex: " + e);
				}
			}
			if (resource1 != null) {
				try {
					resource1.closeEx(); // 이 코드 호출 안됨!
				} catch (CloseException e) {
					System.out.println("close ex: " + e);
				}
			}
		}
	}
}