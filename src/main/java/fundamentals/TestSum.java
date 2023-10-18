package fundamentals;

public class TestSum {
    public static void main(String[] args) {
        // Initialize sum
        float sum = 0;
        // Add 0.01, 0.02, ..., 0.99, 1 to sum
        for (var i = 0.01f; i <= 1.0d; i += 0.01d)
            sum += i;
        // Display result
        System.out.println("The sum is " + sum);
    }
}

