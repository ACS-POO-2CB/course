package fundamentals;

import java.util.Arrays;

public class Swap {
    public static void swap(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }


    public static void swap(int[] array) {
        int temp = array[0];
        array[0] = array[1];
        array[1] = temp;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        a = new int[]{4, 5, 6};

        swap(a[0], a[1]);
        IO.println(Arrays.toString(a));
        swap(a);
        IO.println(Arrays.toString(a));
    }
}
