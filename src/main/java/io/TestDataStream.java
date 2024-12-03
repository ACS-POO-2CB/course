package io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestDataStream {
	public static void main(String[] args) {
		// Create an output stream for file temp.dat
		try (DataOutputStream output = new DataOutputStream(new FileOutputStream("src/main/resources/temp.dat"));
				DataInputStream input = new DataInputStream(new FileInputStream("src/main/resources/temp.dat"))) {

			// Write student test scores to the file
			output.writeUTF("John Wick");
			output.writeDouble(999.9);
			output.writeUTF("Jim");
			output.writeDouble(185.5);
			output.writeUTF("George");
			output.writeDouble(105.25);

			// Read student test scores from the file
			while (input.available()>0) {
				System.out.println(input.readUTF() + "\t| " + input.readDouble());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Everything is ok!");
		}
	}
}
