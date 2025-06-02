package network.tcp.autocloseable;

/**
 * Resource V1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-02
 * @version 1.0
 */
public class ResourceV1 {

	private String name;

	public ResourceV1(String name) {
		this.name = name;
	}

	public void call() {
		System.out.println(name + " call");
	}

	public void callEx() throws CallException {
		System.out.println(name + " callEx");
		throw new CallException(name + " ex");
	}

	public void close() {
		System.out.println(name + " close");
	}

	public void closeEx() throws CloseException {
		System.out.println(name + " closeEx");
		throw new CloseException(name + " ex");
	}
}