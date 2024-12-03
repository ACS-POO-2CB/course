package inner_class;

public class OC {// outer class
    static int x = 2;
    public class IC {// inner class
        int x = 6;
        public void getX() {
            // inner class method
            int x = 8;
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(OC.x);
        }
    }

    public static void main(String[] args) {
        new OC().new IC().getX();
    }
}
// What is the result?
