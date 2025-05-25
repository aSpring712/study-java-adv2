package io.start;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Print Stream Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-24
 * @version 1.0
 */
public class PrintStreamMain {

	public static void main(String[] args) throws IOException {

		PrintStream printStream = System.out;

		byte[] bytes = "Hello! \n".getBytes(StandardCharsets.UTF_8);
		printStream.write(bytes);
		printStream.println("Print!");
	}
}