package generics.algorithms;

import java.io.Serializable;

public class Algorithm1 {
    public static <T> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] a = {1, 5, 21};
        swap(a, 0, 1);
        swap(a, 1, 2);
        for (Integer integer : a) {
            System.out.println(integer);
        }
    }
}
