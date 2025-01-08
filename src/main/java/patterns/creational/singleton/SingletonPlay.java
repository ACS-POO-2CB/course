package patterns.creational.singleton;

public class SingletonPlay {
    private static Unique instance =Unique.getInstance();

    public static void main(String[] args) {
        System.out.println("Starting...");
        System.out.println(instance.getSetting());
        System.out.println(Unique.getInstance().getSetting());
        System.out.println(Unique.getInstance().getSetting());
        System.out.println(Unique.getInstance().getSetting());
    }
}

