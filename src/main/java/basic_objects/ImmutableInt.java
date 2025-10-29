package basic_objects;

public class ImmutableInt {
    private Integer x;

    public ImmutableInt(int x) {
        this.x = x;
    }

    public ImmutableInt() {
        this(-1);
    }

    public static void changeInt(Integer x) {
        x++;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public static void changeInt(ImmutableInt x) {
//        x.setX(x.getX()+1);
        x.x++;
    }

    @Override
    public String toString() {
        return "ImmutableInt{" +
                "x=" + x +
                '}';
    }

    public static void main(String[] args) {
        System.out.println("-----------------");
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));

        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4);
        System.out.println(i3.equals(i4));

        System.out.println("-----------------");
        changeInt(i3);
        System.out.println(i3);

        ImmutableInt i5 = new ImmutableInt();
        System.out.println(i5);
        changeInt(i5);
        System.out.println(i5);

        String s3 = new String("Am venit și azi la curs");

        String s1 = "Am venit și azi la curs";
        String s2 = "Am venit și azi la curs";

//        System.out.println(s1 + " Am venit");
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
    }
}