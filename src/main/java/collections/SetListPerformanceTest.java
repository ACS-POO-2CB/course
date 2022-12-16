package collections;

import java.util.*;

public class SetListPerformanceTest {
    public static void main(String[] args) {
        Collection<Integer> set1 = new HashSet<Integer>();
        System.out.println("Time for hash set is " + getTestTime(set1, 600000) + " milliseconds");

        Collection<Integer> set2 = new LinkedHashSet<Integer>();
        System.out.println("Time for linked hash set is " + getTestTime(set2, 600000) + " milliseconds");

        Collection<Integer> set3 = new TreeSet<Integer>();
        System.out.println("Time for tree set is " + getTestTime(set3, 600000) + " milliseconds");

        Collection<Integer> list1 = new ArrayList<Integer>();
        System.out.println("Time for array list is " + getTestTime(list1, 600000) + " milliseconds");

        Collection<Integer> list2 = new LinkedList<Integer>();
        System.out.println("Time for linked list is " + getTestTime(list2, 600000) + " milliseconds");
    }

    public static long getTestTime(Collection<Integer> c, int size) {
        long startTime = System.currentTimeMillis();

        // Add numbers 0, 1, 2, ..., size - 1 to the array list
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < size; i++)
            list.add(i);

        Collections.shuffle(list); // Shuffle the array list

        // Add the elements to the container
        for (int element : list)
            c.add(element);

        Collections.shuffle(list); // Shuffle the array list

        // Remove the element from the container
        for (int element : list)
            c.remove(element);

        long endTime = System.currentTimeMillis();
        return endTime - startTime; // Return the execution time
    }
}
