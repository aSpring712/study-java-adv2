package io.text;

import static io.text.TextConst.FILE_NAME;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * Reader Writer Main V4
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-25
 * @version 1.0
 */
public class ReaderWriterMainV4 {

	private static final int BUFFER_SIZE = 8192;

	public static void main(String[] args) throws IOException {

		String writeString = "ABC\n가나다";
		System.out.println("== WriteString ==");
		System.out.println(writeString);

		// 파일에 쓰기
		FileWriter fw = new FileWriter(FILE_NAME, UTF_8);
		BufferedWriter bw = new BufferedWriter(fw, BUFFER_SIZE);
		bw.write(writeString);
		bw.close();

		// 파일에서 읽기
		StringBuilder content = new StringBuilder();
		FileReader fr = new FileReader(FILE_NAME, UTF_8);
		BufferedReader br = new BufferedReader(fr, BUFFER_SIZE);

		String line;
		while ((line = br.readLine()) != null) {
			content.append(line).append("\n");
		}
		br.close();

		System.out.println("== Read String ==");
		System.out.println(content);
	}
}