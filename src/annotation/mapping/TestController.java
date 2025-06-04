package annotation.mapping;

/**
 * Test Controller
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-04
 * @version 1.0
 */
public class TestController {

	@SimpleMapping(value = "/")
	public void home() {
		System.out.println("TestController.home");
	}

	@SimpleMapping(value = "/site1")
	public void page1() {
		System.out.println("TestController.page1");
	}
}