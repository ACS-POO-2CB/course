package inheritance;

class Super {
    static int no = 2000;

    static {
        no = 2001;
        System.out.println("Super!");
    }

    static {
        no++;
        System.out.println("Super super!");
    }

    public static void doSomething() {
        System.out.println("Facem ceva super!");
    }
}

class Sub extends Super {
    static int no = 1000;

    static {
        System.out.println("Nooo!");
    }

    public static void doSomething() {
        System.out.println("Ne-am razgandit si nu mai facem!");
    }
}

public class StaticTest {
    public static void main(String[] args) {
//        Sub s= new Sub();
//        System.out.println("Fluffy");
//        System.out.println(Super.no);
//        System.out.println(Sub.no);

        //try this block instead of the above two lines
//        Sub.doSomething();

        //or this block instead of the above lines
//        new Sub();
//        new Sub();
    }
}