package fundamentals;


import java.util.Scanner;

public class ComputeArea {
    /**
     * Main method
     */
    public static void main(String[] args) {
        final double radius;
        double area;

        // Read radius from console
        System.out.println("Enter a number for radius: ");

        radius = new java.util.Scanner(System.in).nextDouble();

        // Compute area
        area = Math.PI * Math.pow(radius, 2);

        // Display results
        System.out.println("Area for the circle of R= " + radius + " is " + area);
    }
}

