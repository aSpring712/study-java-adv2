package io.start;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Stream Start Main2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-24
 * @version 1.0
 */
public class StreamStartMain2 {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("temp/hello.dat");
		fos.write(65);
		fos.write(66);
		fos.write(67);
		fos.close();

		FileInputStream fis = new FileInputStream("temp/hello.dat");
		int data;
		while ((data = fis.read()) != -1) {
			System.out.println(data);
		}
		fis.close();
	}
}