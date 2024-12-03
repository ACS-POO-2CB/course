package io;

import java.io.*;

public class TestRandomAccessFile {
    public static void main(String[] args) throws IOException {
        // Create a random access file
        RandomAccessFile inout = new RandomAccessFile("src/main/resources/inout.dat", "rw");

        inout.setLength(0);

        for (int i = 0; i < 200; i++)
            inout.writeInt(i);

        System.out.println("Current file length is " + inout.length());

        inout.seek(0);
        System.out.println("The first number is " + inout.readInt());

        inout.seek(1 * 4+5);
        System.out.println("The 1.5th number is " + inout.readInt());

        inout.seek(10 * 4);
        System.out.println("The 10th number is " + inout.readInt());

        inout.writeInt(555);

        inout.seek(inout.length());
        inout.writeInt(999);

        System.out.println("The new length is " + inout.length());

        inout.seek(10 * 4);
        System.out.println("The eleventh number is " + inout.readInt());

        inout.close();
    }
}
