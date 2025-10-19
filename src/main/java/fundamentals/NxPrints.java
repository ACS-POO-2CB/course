package fundamentals;

public class NxPrints {
    public static void nPrintln(String message, int n) {
        for (int i = 0; i < n; i++) {
            message += i;
            System.out.println(message);
        }
        n = 0;
        double[] myList=null;
        ///
        float[] df= new float[] {1.9f, 2.9f, 3.4f, 3.5f};

    }

    static void main() {
        String message = "Welcome to Java";
        int n = 5;
        nPrintln(message, n);
        IO.println(message + " " + n);
    }
}
