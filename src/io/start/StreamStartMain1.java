package io.start;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Stream Start Main1
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-24
 * @version 1.0
 */
public class StreamStartMain1 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("temp/hello.dat");
		fos.write(65);
		fos.write(66);
		fos.write(67);
		fos.close();

		FileInputStream fis = new FileInputStream("temp/hello.dat");
		System.out.println(fis.read());
		System.out.println(fis.read());
		System.out.println(fis.read());
		System.out.println(fis.read());
		fis.close();
	}
}