package fundamentals;


public class Random {
    public static void main(String[] args) {
        extracted(new java.util.Random(42));

        extracted(new java.util.Random(42));

        extracted(new java.util.Random());
    }

    private static void extracted(java.util.Random random) {
        for (int i = 0; i < 10; i++)
            System.out.print(random.nextInt(1000) + " ");
        System.out.println("\n---------------------------------------\n");
    }
}
