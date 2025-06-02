package network.tcp.v1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Inet Address Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-02
 * @version 1.0
 */
public class InetAddressMain {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress localhost = InetAddress.getByName("localhost");
		System.out.println(localhost);

		InetAddress google = InetAddress.getByName("google.com");
		System.out.println(google);
	}
}