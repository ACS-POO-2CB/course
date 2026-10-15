package fundamentals;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random(42);

        // Generate a random integer between 0 and 99
        for (int i=0; i < 10; i++) {
            System.out.print( random.nextInt(100)+" ");
        }
    }
}
