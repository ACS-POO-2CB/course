package patterns.behavioral.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

// Concrete class implementing the Container interface
public class NumberRepository implements Container {
    private final List<Integer> numbers;

    public NumberRepository(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public Iterator<Integer> getIterator() {
        return new CustomIterator(this::checkEven);
    }

    public Iterator<Integer> getPrimeNumberIterator() {
        return new CustomIterator(this::checkPrime);
    }

    // Inner class for iterating over even numbers
    private class CustomIterator implements Iterator<Integer> {
        private int index = 0;
        Function<Integer, Boolean> function;

        public CustomIterator(Function<Integer, Boolean> function) {
            this.function = function;
        }

        @Override
        public boolean hasNext() {
            while (index < numbers.size()) {
                if (function.apply(numbers.get(index))) {
                    return true;
                }
                index++;
            }
            return false;
        }

        @Override
        public Integer next() {
            if (this.hasNext()) {
                return numbers.get(index++);
            }
            throw new NoSuchElementException();
        }
    }

    boolean checkEven(int number) {
        return number % 2 == 0;
    }

    boolean checkPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
