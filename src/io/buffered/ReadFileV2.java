package io.buffered;

import static io.buffered.BufferedConst.BUFFER_SIZE;
import static io.buffered.BufferedConst.FILE_NAME;
import static io.buffered.BufferedConst.FILE_SIZE;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Read File V2
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-25
 * @version 1.0
 */
public class ReadFileV2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(FILE_NAME);
		long startTime = System.currentTimeMillis();

		byte[] buffer = new byte[FILE_SIZE];
		int fileSize = 0;
		int size;
		while ((size = fis.read(buffer)) != -1) {
			fileSize += size;
		}
		fis.close();

		long endTime = System.currentTimeMillis();
		System.out.println("File name: " + FILE_NAME);
		System.out.println("File size: " + (fileSize / 1024 / 1024) + "MB");
		System.out.println("Time taken: " + (endTime - startTime) + "ms");
	}
}