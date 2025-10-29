package basic_objects;

import java.util.Arrays;

public class SimplifiedHelloWorld {
    public SimplifiedHelloWorld(int unused) {
        IO.println("Hello again, World!");
    }

    void main() {
        //  SimplifiedHelloWorld app = new SimplifiedHelloWorld();
        //  app.main(args);
        IO.println("New Hello, World!");
    }

    public static void main(String[] args){
        System.out.println("Hello, World!!!");
IO.println(Arrays.asList(args));
        SimplifiedHelloWorld simplifiedHelloWorld = new SimplifiedHelloWorld(1);
    }
}
