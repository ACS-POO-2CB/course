package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileStream {
    public static void main(String[] args) throws IOException {
        // Create an output stream to the file
        FileOutputStream output = new FileOutputStream("src/main/resources/temp.dat");

        // Output values to the file
        for (int i = -256; i <= 10; i++)
            output.write(i);
        output.write(' ');

        // Close the output stream
        output.close();

        // Create an input stream for the file
        FileInputStream input = new FileInputStream("src/main/resources/temp.dat");

        // Read values from the file
        int value;
        while ((value = input.read()) != -1)
            System.out.print(value + "\t");

        // Close the output stream
        input.close();
    }
}
