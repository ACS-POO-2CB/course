package generics;

import abstract_interface.geometry.AbstractGeometricObject;

class X {
    int x;

    public <X extends Number & Comparable<X>> X(X x) {
        this.x = x.intValue();
    }

    public <X> X(X x) {
        this.x = 1;
    }

    public <X> X X(X x) {
        return x;
    }

    public static void main(String[] args) {
        X x1 = new X(10d);
        X x2 = new X("BAU");
        System.out.println(x1.x + " " + x2.x);
        System.out.println(x1.X(x2));
        print(x1);
        print(x2);
    }

    @Override
    public String toString() {
        return "X{" +
                "x=" + x +
                '}';
    }

    public static <X> void print(X a) {
        System.out.println(a);
    }
}
