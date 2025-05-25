package io.start;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * Byte Array Stream Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-24
 * @version 1.0
 */
public class ByteArrayStreamMain {

	public static void main(String[] args) throws IOException {

		byte[] input = {1, 2, 3};

		// 메모리에 쓰기
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.write(input);

		// 메모리에서 읽기
		ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
		byte[] bytes = bais.readAllBytes();
		System.out.println(Arrays.toString(bytes));
	}
}