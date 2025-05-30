package io.file;

import java.io.File;
import java.io.IOException;

/**
 * Old File Path
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-30
 * @version 1.0
 */
public class OldFilePath {

	public static void main(String[] args) throws IOException {
		File file = new File("temp/..");
		System.out.println("path = " + file.getPath());
		// 절대 경로
		System.out.println("Absolute path = " + file.getAbsolutePath());
		// 정규 경로
		System.out.println("Canonical path = " + file.getCanonicalPath());

		File[] files = file.listFiles();
		for (File f : files) {
			System.out.println((f.isFile()) ? "F" : "D" + " | " + f.getName());
		}
	}
}