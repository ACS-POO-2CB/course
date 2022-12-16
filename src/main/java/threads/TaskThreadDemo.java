package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskThreadDemo {
    public static void main(String[] args) {
        // Create a fixed thread pool with maximum three threads

        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit runnable tasks to the executor
        executor.execute(new PrintChar('a', 100));
        executor.execute(new PrintChar('b', 100));
        executor.execute(new PrintNum(100));

        // Shut down the executor
        executor.shutdown();

//        // Create tasks
//        Runnable printA = new PrintChar('a', 100);
//        Runnable printB = new PrintChar('b', 100);
//        Runnable print100 = new PrintNum(100);
//
//        // Create threads
//        Thread thread1 = new Thread(printA);
//        Thread thread2 = new Thread(printB);
//        Thread thread3 = new Thread(print100);
//
//        // Start threads
//        thread3.start();
//        thread1.start();
//        thread2.start();
    }
}

// The task for printing a specified character in specified times
class PrintChar implements Runnable {
    private char charToPrint; // The character to print
    private int times; // The times to repeat

    /**
     * Construct a task with specified character and number of times to print
     * the character
     */
    public PrintChar(char c, int t) {
        charToPrint = c;
        times = t;
    }

    /**
     * Override the run() method to tell the system what the task to perform
     */
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.print(charToPrint);
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            Thread.yield();
        }
    }
}

// The task class for printing number from 1 to n for a given n
class PrintNum implements Runnable {
    private int lastNum;

    /**
     * Construct a task for printing 1, 2, ... i
     */
    public PrintNum(int n) {
        lastNum = n;
    }

    /**
     * Tell the thread how to run
     */
    public void run() {
        for (int i = 1; i <= lastNum; i++) {
            System.out.print(i);
            /*try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            Thread.yield();
        }
    }
}