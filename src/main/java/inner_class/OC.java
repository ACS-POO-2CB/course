package inner_class;

public class OC {// outer class
    int x = 2;
    static int y = 3;

    public class IC {// inner class
        int x = 6;
        static int y = 7;

        public void getX() {
            // inner class method
            int x = 8;
            int y = 9;
            System.out.println(x);
            IO.println(y);
            System.out.println(this.x);
            IO.println(IC.y);
            System.out.println(OC.this.x);
            IO.println(OC.y);
        }
    }

    public static void main(String[] args) {
        new OC().new IC().getX();
    }
}
// What is the result?
