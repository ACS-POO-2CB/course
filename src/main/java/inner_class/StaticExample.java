package inner_class;

class Outer {
    private int x;
    private static int y;

    @Override
    public String toString() {
        return "Outer [x=" + x + "]";
    }

    // Non-static inner class: it is tied to an instance of Outer.
    class Inner extends Outer {
        int x;
        static int y;

        public Inner(int value) {
            super.x = value;
            this.x = 2 * value;
            Outer.this.x = 3 * value;
            // Never ever: do not uncomment the following line.
            // Inner nested = this.new Inner(value++);
        }

        static void print() {
            System.out.println(y);
        }

        @Override
        public String toString() {
            return "Inner [super.x=" + super.x + ", this.x=" + this.x + ", outer.x=" + Outer.this.x + "]";
        }
    }

    // Static nested class: it does not need an Outer instance.
    static class StaticClass {
        int x;
        static int y;

        public StaticClass(int value) {
            this.x = 2 * value;
            y++;
            Outer.y = 3 * y;
        }

        static void print() {
            System.out.println("StaticClass: " + Outer.y + "/" + StaticClass.y);
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
    private static void printSeparator() {
        System.out.println("-----------------");
    }

    public static void main(String[] str) {
        Outer outer = new Outer();

        System.out.println("1) Inner class example: needs an enclosing instance.");
        Outer.doSomething();
        Outer.StaticClass.print();

        printSeparator();

        System.out.println("2) Creating an inner object from an outer object.");
        Outer.Inner inner = outer.new Inner(1);
        System.out.println(inner);
        System.out.println("Inner.y = " + Outer.Inner.y);
        // inner = outer.new Inner(2).new Inner(3).new Inner(4).new Inner(5).new Inner(6);

        printSeparator();

        System.out.println("3) Static nested class: no outer instance required.");
        Outer.StaticClass staticClass1 = new Outer.StaticClass(1);
        System.out.println(staticClass1);
        Outer.StaticClass staticClass2 = new Outer.StaticClass(2);
        System.out.println(staticClass2);

        staticClass2.print();
    }
}
