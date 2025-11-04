package inheritance;

class Super {
    static int no = 2000;

    static {
        no++;
        System.out.println("Super super!");
    }

    static {
        no = 2004;
        System.out.println("Super!");
    }

    public static void doSomething() {
        System.out.println("We are doing something super!");
    }
}

class Sub extends Super {
    static int no = initNo();

    static int initNo(){
        System.out.println("Nooo!");
        return 1000;
    }

    public static void doSomething() {
        System.out.println("We changed our mind! Nothing!");
    }
}

public class StaticTest {
    public static void main(String[] args) {
        Sub s= new Sub();

        System.out.println("Fluffy");
        System.out.println(Super.no);
        System.out.println(Sub.no);

        //try this block instead of the above two lines
//        Super.doSomething();
//        Sub.doSomething();

        //or this block instead of the above lines
//        new Sub().doSomething();
//        new Sub().doSomething();
//        new Sub().doSomething();
    }
}