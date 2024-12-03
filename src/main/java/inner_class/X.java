package inner_class;

public class X {
    int x = 10;

    X(int x) {
        this.x = x;
    }

    void x(int x) {
        this.x = x;
    }

    void X(int X) {
        this.x = X;
    }

    public class Y {
        int x;

        Y() {
            this.x = X.this.x;
        }

        void x(int x) {
            int z;
            z = 100;
            abstract class x {
                int x;

                public x(int x) {
                    this.x = x + z;
                }

                public x() {
                    this.x = X.Y.this.x;
                }
            }
            x X = new x(x) {
            };
            System.out.println(x + " " + X.x + " " + this.x + " " + X.this.x);
        }
    }

    public class Z extends Y {
        int x;

        Z() {
            super();
            this.x = 3;
            super.x = 5;
        }

        void x(int x) {
            super.x(x);
            System.out.println(x + "/" + this.x + "/" + Z.super.x + "/" + X.this.x);
        }
    }

    public static void main(String[] args) {
        X x = new X(1);
        Y y = x.new Y();
        Y z = x.new Z();

        y.x(1);
        z.x(2);
    }
}
