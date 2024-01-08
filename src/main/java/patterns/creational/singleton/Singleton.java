package patterns.creational.singleton;

public class Singleton {
    private static Unique x;

    public static void main(String[] args) {
        System.out.println("Starting...");
        System.out.println(Unique.getInstance().getSetting());
        System.out.println(Unique.getInstance().getSetting());
        System.out.println(Unique.getInstance().getSetting());
    }
}

