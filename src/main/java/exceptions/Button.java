package exceptions;

public class Button {
    static int x;
    { int[] ia2 = {4,5,6}; }
    static {
        int[] ia = {1,2,3};
        for(int i = 0; i < 3; i++)
            System.out.println(ia[i] + " ");
        x = 7;
        System.out.println(x + " ");
    }
}
