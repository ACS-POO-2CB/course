package fundamentals;

/**
 * A very useful class to compute the area of a circle given its radius.
 *
 * @author Mihai Dascalu
 * @version 1.0
 */

public class ComputeArea {
    /**
     * Main method with the entire logic of the program.
     * Not the best way to write code, but it works.
     */
    public static void main(String[] args) {

        // Declare radius as a final variable to ensure its value cannot be changed once assigned
        final double radius;
        double area;

        // Display welcome message
        System.out.println("Welcome to the ComputeArea program!");

        // Read radius from console
        System.out.println("Enter a number for radius: ");

        radius = new java.util.Scanner(System.in).nextDouble();

        // Compute area
        area = Math.PI * Math.pow(radius, 2);

        String s = """
                Ana
                are
                mere
                """;

        char s1 = 'd';

        switch (s1) {
            default -> System.out.println("default");
            case 'a', 'c' -> System.out.println("a");
            case 'b' -> System.out.println("b");
        }

        // Display results
        System.out.println("Area for the circle of R= " + radius + " is " + area);
    }
}

