package inner_class;

class Broom {
    static class B2 {
        void goB2() {
            System.out.println("Hi!!");
        }
    }
}

public class BigOuter extends Broom {
    static class Nest {
        void go() {
            System.out.println("Hi");
        }
    }

    static class B2 extends Broom.B2 {
        void go() {
            System.out.println("Hi hi hi!");
        }
    }

    public static void main(String[] args) {
        BigOuter.Nest n = new BigOuter.Nest(); // both class names
        n.go();
        BigOuter.B2 b2 = new BigOuter.B2(); // access the enclosed class
        b2.goB2();
        b2.go();
    }
}



