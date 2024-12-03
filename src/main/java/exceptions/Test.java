package exceptions;

public class Test {
    public static void main(String[] args) {
        int i = 4;
        float f = 4.3f;
        double d = 1.8;
        byte b = 0x11;
        System.out.println(b == 17);
        int c = 0;
        if (i == f) c++;
        if (((int) (f + d)) == ((int) f + (int) d)) c += 2;
        System.out.println(c);
        for (int x = 0; x < 5; x=bump(x))
            System.out.print(x + " ");
    }

    static int bump(int i) {
        i = i + 2;
        return i;
    }

}
