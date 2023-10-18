package basic_objects;

public class Random {
    public static void main(String[] args) {
        java.util.Random random1 = new java.util.Random(3);
        System.out.print("From random1: ");
        for (int i = 0; i < 10; i++)
            System.out.print(random1.nextInt(1000) + " ");
        java.util.Random random2 = new java.util.Random(3);
        System.out.print("\nFrom random2: ");
        for (int i = 0; i < 10; i++)
            System.out.print(random2.nextInt(1000) + " ");
    }
}
