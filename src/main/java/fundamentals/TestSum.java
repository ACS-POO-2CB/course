package fundamentals;

public class TestSum {
    // Main method with big problems
    public static void main(String[] args) {
        // Initialize sum
        double sum = 0;
        // Add 0.01, 0.02, ..., 0.99, 1 to sum
        for (var i = 0.01d; i <= 1.0d; i += 0.01d) {
            IO.println(i);
            sum += i;
        }
        // Display result
        System.out.println("The sum is " + sum);
    }
}