package fundamentals;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

public class TestSumCool {
    public static void main(String[] args) {
        // Initialize sum
        BigDecimal sum = new BigDecimal(BigInteger.ZERO);

        // Add 0.01, 0.02, ..., 0.99, 1 to sum
        for (var i = 0.01d; i <= 1.0d; i += 0.01d) {
            IO.println(i);
            sum = sum.add(BigDecimal.valueOf(i), MathContext.DECIMAL64);
        }

        // Display result
        System.out.println("The sum is " + sum);
    }
}
