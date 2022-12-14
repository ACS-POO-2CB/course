package generics;

import java.util.Arrays;
import java.util.List;

public final class Algorithm<T extends Comparable<T>> {
    public T max(T a1, T a2) {
        if (a1.compareTo(a2) >= 0)
            return a1;
        return a2;
    }

    public static <T> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public T max(List<? extends T> list, int begin, int end) {
        if (begin >= end)
            return list.get(begin);
        return max(list.get(begin), max(list, begin + 1, end));
    }

    public static void main(String[] args) {
        Algorithm<Integer> algo = new Algorithm<>();
        System.out.println(algo.max(Arrays.asList(1, 2, 3, 4), 0, 3));
    }
}
