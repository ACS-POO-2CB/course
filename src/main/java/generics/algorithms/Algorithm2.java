package generics.algorithms;

import java.util.Arrays;
import java.util.Collection;

interface UnaryPredicate<T> {
    public boolean test(T obj);
}

class OddPredicate implements UnaryPredicate<Integer> {
    public boolean test(Integer i) { return i % 2 != 0; }
}
public class Algorithm2 {
    public static <T> int countIf (Collection<T> c, UnaryPredicate<T> p) {
        int count = 0;
        for (T elem : c)
            if (p.test(elem))
                count++;
        return count;
    }
    public static void main(String[] args) {
        Collection<Integer> ci = Arrays.asList(1, 2, 3, 4);
        int count = Algorithm2.countIf(ci, new OddPredicate());
        System.out.println("Number of odd integers = " + count);
    }
}