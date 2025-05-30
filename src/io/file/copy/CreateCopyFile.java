package io.file.copy;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Create Copy File
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-30
 * @version 1.0
 */
public class CreateCopyFile {
	private static final int FILE_SIZE = 200 * 1024 * 1024; // 200MB

	public static void main(String[] args) throws IOException {
		String fileName = "temp/copy.dat";
		long startTime = System.currentTimeMillis();

		FileOutputStream fos = new FileOutputStream(fileName);
		byte[] buffer = new byte[FILE_SIZE];
		fos.write(buffer);
		fos.close();

		long endTime = System.currentTimeMillis();
		System.out.println("File created: " + fileName);
		System.out.println("File size: " + FILE_SIZE / 1024 / 1024 + "MB");
		System.out.println("Time taken: " + (endTime - startTime) + "ms");
	}
}