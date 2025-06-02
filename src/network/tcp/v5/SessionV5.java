package network.tcp.v5;

import static util.MyLogger.log;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * Session V5
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-06-02
 * @version 1.0
 */
public class SessionV5 implements Runnable {

	private final Socket socket;

	public SessionV5(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try (socket; // Session에서 직접 생성하는 것이 아니라 외부에서 받아오는 객체 -> try 선언부에 객체의 참조를 넣어두면 자원 정리 시점에 AutoCloseable 호출됨
			 DataInputStream input = new DataInputStream(socket.getInputStream());
			 DataOutputStream output = new DataOutputStream(socket.getOutputStream())) {

			while (true) {
				// 클라이언트로부터 문자 받기
				String received = input.readUTF(); // 블로킹
				log("client -> server: " + received);

				if (received.equals("exit")) {
					break;
				}

				// 클라이언트에게 문자 보내기
				String toSend = received + " World!";
				output.writeUTF(toSend);
				log("client <- server: " + toSend);
			}
		} catch (IOException e) {
			log(e);
		}

		log("연결 종료: " + socket + " isClosed: " + socket.isClosed());
	}
}