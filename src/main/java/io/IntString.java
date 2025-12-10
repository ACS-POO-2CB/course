package io;

public class IntString {
    private int x;

    public static void changeInt(Integer x) {
        x++;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public static void changeInt(IntString x) {
//        x.setX(x.getX()+1);
        x.x++;
    }

    @Override
    public String toString() {
        return "IntString{" +
                "x=" + x +
                '}';
    }

    public static void main(String[] args) {
        String a = "Java";
        String b = "Java";
        String c = new String("Java");
        String d = "Ja" + "va";
        String e = new String("Java");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a == d);
        System.out.println(c == e);

        System.out.println("-----------------");
        c.concat(d);
        System.out.println(c);

        System.out.println("-----------------");
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2);

        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4);

        System.out.println("-----------------");
        changeInt(i3);
        System.out.println(i3);

        IntString i5 = new IntString();
        System.out.println(i5);
        changeInt(i5);
        System.out.println(i5);
    }
}
