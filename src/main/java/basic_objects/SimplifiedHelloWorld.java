package basic_objects;

import java.util.Arrays;

public class SimplifiedHelloWorld {
    public SimplifiedHelloWorld(int iterations) {
        for (int i = 0; i < iterations; i++) {
            IO.println("Hello, World!");
        }
    }

    public SimplifiedHelloWorld() {
        IO.println("Hello World!");
    }

    void main() {
        SimplifiedHelloWorld app = new SimplifiedHelloWorld(1);
//        SimplifiedHelloWorld.main(new String[] {app.getClass().getName()});
        IO.println("New Hello, World!");
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!!!");

        new SimplifiedHelloWorld(1);
//      new SimplifiedHelloWorld(1).main();
    }
}
