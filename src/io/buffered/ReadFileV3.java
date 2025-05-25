package io.buffered;

import static io.buffered.BufferedConst.BUFFER_SIZE;
import static io.buffered.BufferedConst.FILE_NAME;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Read File V3
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-25
 * @version 1.0
 */
public class ReadFileV3 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(FILE_NAME);
		BufferedInputStream bis = new BufferedInputStream(fis, BUFFER_SIZE);
		long startTime = System.currentTimeMillis();

		int fileSize = 0;
		int data;
		while ((data = bis.read()) != -1) {
			fileSize++;
		}
		bis.close();

		long endTime = System.currentTimeMillis();
		System.out.println("File name: " + FILE_NAME);
		System.out.println("File size: " + (fileSize / 1024 / 1024) + "MB");
		System.out.println("Time taken: " + (endTime - startTime) + "ms");
	}
}