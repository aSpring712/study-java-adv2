package network.tcp.autocloseable;

/**
 * Resource V2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-02
 * @version 1.0
 */
public class ResourceV2 implements AutoCloseable {

	private String name;

	public ResourceV2(String name) {
		this.name = name;
	}

	public void call() {
		System.out.println(name + " call");
	}

	public void callEx() throws CallException {
		System.out.println(name + " callEx");
		throw new CallException(name + " ex");
	}

	@Override
	public void close() throws CloseException {
		System.out.println(name + " closeEx");
		throw new CloseException(name + " ex");
	}
}