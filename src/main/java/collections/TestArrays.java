package collections;

import java.util.*;

public class TestArrays {
    public static void main(String[] args) {
        // Create an array of 10 int values
        Integer[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        Arrays.fill(array, 6, 8, 50);
        System.out.println("After filling, the array is");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        Arrays.sort(array);
        System.out.println("After sorting, the array is");

        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Search 30 in the array : " + Arrays.binarySearch(array, 30));

        System.out.println("Search 3 in the array : " + Arrays.binarySearch(array, 3));

        System.out.println("Search -30 in the array : " + Arrays.binarySearch(array, -30));

        Integer[] a = new Integer[10];
        System.out.println("Compare array with a : " + Arrays.equals(array, a));

        List<Integer> list = Arrays.asList(a);

        list.set(13, 10);

        for (Integer i : list)
            System.out.print(i + " ");
    }
}
