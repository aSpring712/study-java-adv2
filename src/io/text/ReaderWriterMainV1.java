package io.text;

import static io.text.TextConst.FILE_NAME;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import static java.nio.charset.StandardCharsets.UTF_8;
import java.util.Arrays;

/**
 * Reader Writer Main V1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-25
 * @version 1.0
 */
public class ReaderWriterMainV1 {

	public static void main(String[] args) throws IOException {

		String writeString = "ABC";
		// 문자 -> UTF-8 인코딩
		byte[] writeBytes = writeString.getBytes(UTF_8);
		System.out.println("write String: " + writeString);
		System.out.println("write bytes: " + Arrays.toString(writeBytes));

		// 파일에 쓰기
		FileOutputStream fos = new FileOutputStream(FILE_NAME);
		fos.write(writeBytes);
		fos.close();

		// 파일에서 읽기
		FileInputStream fis = new FileInputStream(FILE_NAME);
		byte[] readBytes = fis.readAllBytes();
		fis.close();

		// byte -> String UTF-8 디코딩
		String readString = new String(readBytes, UTF_8);

		System.out.println("read bytes: " + Arrays.toString(writeBytes));
		System.out.println("read String: " + readString);
	}
}