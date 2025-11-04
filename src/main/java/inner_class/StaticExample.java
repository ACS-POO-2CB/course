package inner_class;

class Outer {
    private int x;
    private static int y;

    @Override
    public String toString() {
        return "Outer [x=" + x + "]";
    }

    class Inner extends Outer {
        int x;
        static int y;

        public Inner(int x) {
            super.x = x;
            this.x = 2 * x;
            Outer.this.x = 3 * x;
            //Never ever, do not de-comment the following line
//            Inner b = this.new Inner(x++);
        }

        static void print() {
            System.out.println(y);
        }

        @Override
        public String toString() {
            return "Inner [x=" + super.x + " " + this.x + " " + Outer.this.x + "]";
        }
    }

    static class StaticClass {
        int x;
        static int y;

        public StaticClass(int x) {
            this.x = 2 * x;
            y++;
            Outer.y = 3 * y;
        }

        static void print() {
            System.out.println("StaticClass: "+Outer.y + "/" + StaticClass.y);
        }

        @Override
        public String toString() {
            return "StaticClass [x=" + x + "]";
        }
    }

    public static void doSomething() {
        Inner inner = new Outer().new Inner(10);
        System.out.println(inner);
    }
}

public class StaticExample {
    public static void main(String[] str) {
        Outer outer = new Outer();
        Outer.doSomething();
        Outer.StaticClass.print();

        System.out.println("-----------------");

        // need of enclosing instance
        Outer.Inner inner = outer.new Inner(1);
        System.out.println(inner);
        System.out.println(Outer.Inner.y);

        System.out.println("-----------------");
        // no need of reference of object of outer class
        Outer.StaticClass staticClass1 = new Outer.StaticClass(1);
        System.out.println(staticClass1);
        Outer.StaticClass staticClass2 = new Outer.StaticClass(2);
        System.out.println(staticClass2);

        staticClass2.print();
    }
}
