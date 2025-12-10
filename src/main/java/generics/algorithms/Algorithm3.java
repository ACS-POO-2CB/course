package generics.algorithms;

import java.util.Arrays;
import java.util.List;

public final class Algorithm3<T extends Comparable<T>> {
    public T max(T a1, T a2) {
        if (a1.compareTo(a2) >= 0)
            return a1;
        return a2;
    }

    public static <T extends Comparable<T>> T maxLong(List<? extends T> list, int begin, int end) {
        T maxElem = list.get(begin);
        for (++begin; begin <= end; begin++) {
            if (maxElem.compareTo(list.get(begin)) < 0) {
                maxElem = list.get(begin);
            }
        }
        return maxElem;
    }


    public T max_Recc(List<? extends T> list, int begin, int end) {
        if (begin >= end)
            return list.get(begin);
        return max(list.get(begin), max_Recc(list, begin + 1, end));
    }

    public static void main(String[] args) {
        Algorithm3<Integer> algo = new Algorithm3<>();
        System.out.println(algo.maxLong(Arrays.asList(1, 2, 3, 4), 0, 3));
        System.out.println(algo.max_Recc(Arrays.asList(1, 2, 3, 4), 0, 3));
    }
}
