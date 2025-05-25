package io.streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * Print Stream Etc Main
 *
 * @author Kwon Bomi / GitHub: aSpring712
 * @since 2025-05-25
 * @version 1.0
 */
public class PrintStreamEtcMain {

	public static void main(String[] args) throws FileNotFoundException {
		FileOutputStream fos = new FileOutputStream("temp/print.txt");
		PrintStream printStream = new PrintStream(fos);
		printStream.println("hello java!");
		printStream.println(10);
		printStream.println(true);
		printStream.printf("hello %s", "world");
		printStream.close();
	}
}