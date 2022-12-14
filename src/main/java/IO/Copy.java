package IO;

import java.io.*;

public class Copy {
    /**
     * Main method
     *
     * @param args [0] for sourcefile
     * @param args [1] for target file
     */
    public static void main(String[] args)  {
        // Check command-line parameter usage
        if (args.length != 2) {
            System.out.println("Usage: java Copy sourceFile target file");
            System.exit(0);
        }

        // Check if source file exists
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " not exist");
            System.exit(0);
        }

        // Check if target file exists
        File targetFile = new File(args[1]);
        if (targetFile.exists()) {
            System.out.println("Target file " + args[1] + " already exists");
            System.exit(0);
        }

        try (BufferedInputStream input = new BufferedInputStream(new FileInputStream(sourceFile), 1024);
        BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targetFile), 1024)) {

            // Continuously read a byte from input and write it to output
            int r;
            int numberOfBytesCopied = 0;
            while ((r = input.read()) != -1) {
                output.write((byte) r);
                numberOfBytesCopied++;
            }

            // Close streams
            input.close();
            output.close();

            // Display the file size
            System.out.println(numberOfBytesCopied + " bytes copied");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
