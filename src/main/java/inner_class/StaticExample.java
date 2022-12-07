package inner_class;

class A {
    int x;
    static int y;

    @Override
    public String toString() {
        return "A [x=" + x + "]";
    }

    class B extends A {
        int x;
        static int y; // not allowed here
        static int z;


        public B(int x) {
            this.x = 2 * x;
            A.this.x = 3 * x;
        }

        static void print() {
            System.out.println(y+z);
        }
        @Override
        public String toString() {
            return "B [x=" + this.x + "]";
        }
    }

    static class C {
        int x;
        static int y; // allowed here

        public C(int x) {
            this.x = 2 * x;
            y++;
            A.y = 3 * y;
        }

        @Override
        public String toString() {
            return "C [x=" + x + "]";
        }
    }

}

public class StaticExample {
    public static void main(String[] str) {
        A a = new A();
        // need of enclosing instance
//        A.B obj1 = a.new B(1);
//        System.out.println(obj1);
        System.out.println(A.B.y);

        // no need of reference of object of outer class
        A.C obj2 = new A.C(1);
        System.out.println(obj2);
        A.C obj3 = new A.C(2);
        System.out.println(obj3);

        System.out.println(A.y + " " + A.C.y);
    }
}
