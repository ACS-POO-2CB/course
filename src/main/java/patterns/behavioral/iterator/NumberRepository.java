package patterns.behavioral.iterator;

import java.util.Iterator;
import java.util.List;

// Concrete class implementing the Container interface
public class NumberRepository implements Container {
    private List<Integer> numbers;

    public NumberRepository(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public Iterator getIterator() {
        return new EvenNumberIterator();
    }

    public Iterator getPrimeNumberIterator() {
        return new PrimeNumberIterator();
    }

    // Inner class for iterating over even numbers
    private class EvenNumberIterator implements Iterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            while (index < numbers.size()) {
                if (numbers.get(index) % 2 == 0) {
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
            return null;
        }
    }

    // Inner class for iterating over prime numbers
    private class PrimeNumberIterator implements Iterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            while (index < numbers.size()) {
                if (isPrime(numbers.get(index))) {
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
            return null;
        }

        // Helper method to check if a number is prime
        private boolean isPrime(int number) {
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
}
