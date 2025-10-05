package fundamentals;

public class MonteCarlo {
    public static void main(String[] args) {
        int hints = 0; // Number of points in the circle
        int trials = 100000000; // Number of iterations

        for (var i = 0; i < trials; i++) {
            // Generate a random point and check if it is inside the circle
            var x = Math.random() * 2.0 - 1;
            var y = Math.random() * 2.0 - 1;
            var distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
            if (distance <= 1)
                hints++;
        }
        System.out.println("PI is " + 4.0 * hints / trials);
    }
}
