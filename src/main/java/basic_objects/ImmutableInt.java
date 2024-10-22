package basic_objects;

public class ImmutableInt {
    private int x;

    public ImmutableInt(int x) {
        this.x = x;
    }

    public ImmutableInt() {
        this(-1);
    }

    public static void modificaInt(Integer x) {
        x++;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public static void modificaInt(ImmutableInt x) {
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
        System.out.println("-----------------");
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2);

        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4);

        System.out.println("-----------------");
        modificaInt(i3);
        System.out.println(i3);

        ImmutableInt i5 = new ImmutableInt();
        System.out.println(i5);
        modificaInt(i5);
        System.out.println(i5);
    }
}