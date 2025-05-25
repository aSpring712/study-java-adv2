package io.buffered;

import static io.buffered.BufferedConst.BUFFER_SIZE;
import static io.buffered.BufferedConst.FILE_NAME;
import static io.buffered.BufferedConst.FILE_SIZE;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Create File V4
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-25
 * @version 1.0
 */
public class CreateFileV4 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream(FILE_NAME);
		long startTime = System.currentTimeMillis();

		byte[] buffer = new byte[FILE_SIZE];
		for (int i = 0; i < FILE_SIZE; i++) {
			buffer[i] = 1;
		}
		fos.write(buffer);
		fos.close();

		long endTime = System.currentTimeMillis();
		System.out.println("File name: " + FILE_NAME);
		System.out.println("File size: " + (FILE_SIZE / 1024 / 1024) + "MB");
		System.out.println("Time taken: " + (endTime - startTime) + "ms");
	}
}