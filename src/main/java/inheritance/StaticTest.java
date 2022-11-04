package inheritance;

class Super {
    static int no = 1000;

    static {
        no=1001;
        System.out.print("Super ");
    }

    public static void doSomething() {
        System.out.println("Facem ceva super!");
    }
}

class Sub extends Super {
    static int no = 1000;
    static {
        System.out.print("Sub ");
    }

    public static void doSomething() {
        System.out.println("Ne-am razgandit si nu mai facem!");
    }
}

public class StaticTest {
    public static void main(String[] args) {
        Sub s= null;
        System.out.println("Fluffy");
//        System.out.println(Super.no);
//        System.out.println(Sub.no);

        //try this block instead of the above two lines
//        Sub.doSomething();

        //or this block instead of the above lines
        new Sub();
        new Sub();
    }
}