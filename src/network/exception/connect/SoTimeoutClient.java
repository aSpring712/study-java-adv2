package network.exception.connect;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * So Timeout Client
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-02
 * @version 1.0
 */
public class SoTimeoutClient {

	public static void main(String[] args) throws IOException, InterruptedException {
		Socket socket = new Socket("localhost", 12345);
		InputStream input = socket.getInputStream();

		try {
			socket.setSoTimeout(3000); // 타임아웃 시간 설정
			int read = input.read(); // 기본은 무한 대기
			System.out.println("read = " + read);
		} catch (Exception e) {
			e.printStackTrace();
		}

		socket.close();
	}
}