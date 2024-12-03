package inner_class;

class A {
    private int x;
    private static int y;

    @Override
    public String toString() {
        return "A [x=" + x + "]";
    }

    class B extends A {
        int x;
        static int y;

        public B(int x) {
            super.x = x;
            this.x = 2 * x;
            A.this.x = 3 * x;
            //Never ever, do not de-comment the following line
//            B b = this.new B(x++);
        }

        static void print() {
            System.out.println(y);
        }

        @Override
        public String toString() {
            return "B [x=" + super.x + " " + this.x + " " + A.this.x + "]";
        }
    }

    static class C {
        int x;
        static int y;

        public C(int x) {
            this.x = 2 * x;
            y++;
            A.y = 3 * y;
        }

        static void print() {
            System.out.println(A.y + "/" + C.y);
        }

        @Override
        public String toString() {
            return "C [x=" + x + "]";
        }
    }

    public static void doSomething() {
        B b = new A().new B(10);
        System.out.println(b);
    }
}

public class StaticExample {
    public static void main(String[] str) {
        A a = new A();
        A.doSomething();
        A.C.print();

        System.out.println("-----------------");
        // need of enclosing instance
        A.B b = a.new B(1);
        System.out.println(b);
        System.out.println(A.B.y);

        System.out.println("-----------------");
        // no need of reference of object of outer class
        A.C c1 = new A.C(1);
        System.out.println(c1);
        A.C c2 = new A.C(2);
        System.out.println(c2);

        c2.print();
    }
}
