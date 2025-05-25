package io.buffered;

import static io.buffered.BufferedConst.*;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Create File V3
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-25
 * @version 1.0
 */
public class CreateFileV3 {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream(FILE_NAME);
		BufferedOutputStream bos = new BufferedOutputStream(fos, BUFFER_SIZE);
		long startTime = System.currentTimeMillis();

		for (int i = 0; i < FILE_SIZE; i++) {
			bos.write(1);
		}
		bos.close();

		long endTime = System.currentTimeMillis();
		System.out.println("File name: " + FILE_NAME);
		System.out.println("File size: " + (FILE_SIZE / 1024 / 1024) + "MB");
		System.out.println("Time taken: " + (endTime - startTime) + "ms");
	}
}