package fundamentals;

public class AmbiguousOverloading {
    public static void main(String[] args) {
        System.out.println(max(1f, 2));
    }

    public static double max(int num1, double num2) {
        return Math.max(num1, num2);
        // return max((double) num1, (int) num2);
    }

    public static double max(double num1, int num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
}


