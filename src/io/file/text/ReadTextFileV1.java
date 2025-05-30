package io.file.text;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import static java.nio.charset.StandardCharsets.UTF_8;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Read Text File V1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-30
 * @version 1.0
 */
public class ReadTextFileV1 {

	private static final String PATH = "temp/hello2.txt";

	public static void main(String[] args) throws IOException {
		String writeString = "abc\n가나다";
		System.out.println("== Write String ==");
		System.out.println(writeString);

		Path path = Path.of(PATH);

		// 파일에 쓰기
		Files.writeString(path, writeString, UTF_8);
		// 파일에서 읽기
		String readString = Files.readString(path, UTF_8);

		System.out.println("== ReadString ==");
		System.out.println(readString);
	}
}