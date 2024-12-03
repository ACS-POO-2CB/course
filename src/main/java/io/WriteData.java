package io;

import java.io.FileNotFoundException;

public class WriteData {
	public static void main(String[] args) {
		java.io.File file = new java.io.File("src/main/resources/scores.txt");
		if (file.exists()) {
			System.out.println("File already exists");
			System.exit(0);
		}

		// Create a file
		try (java.io.PrintWriter output = new java.io.PrintWriter(file)) {
			// Write formatted output to the file
			output.print("John T Smith ");
			output.println(90);
			output.print("Eric K Jones ");
			output.println(85);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}