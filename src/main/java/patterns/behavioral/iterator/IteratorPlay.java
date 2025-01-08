package patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorPlay {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            numbers.add(i);
        }

        NumberRepository repository = new NumberRepository(numbers);

        System.out.print("Even numbers: ");
        for (Iterator iter = repository.getIterator(); iter.hasNext(); ) {
            System.out.print(iter.next() + " ");
        }

        System.out.print("\nPrime numbers: ");
        for (Iterator iter = repository.getPrimeNumberIterator(); iter.hasNext(); ) {
            System.out.print(iter.next() + " ");
        }
    }
}

