package inner_class;

import java.util.Iterator;

public class DataStructure {

    // Create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public DataStructure() {
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public void printEven() {
        Iterator<Integer> iterator = new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    public Iterator<Integer> getIterator() {
        return new EvenIterator();
    }

    interface DataStructureIterator extends Iterator<Integer> {

    }

    private class EvenIterator implements DataStructureIterator {
        private int nextIndex = 0;
        static int noInterators;

        public EvenIterator() {
            noInterators++;
        }

        public boolean hasNext() {
            return (nextIndex <= SIZE - 1);
        }

        public Integer next() {
            Integer retValue = arrayOfInts[nextIndex];
            nextIndex += 2;
            return retValue;
        }
    }

    public static void main(String[] s) {
        DataStructure ds = new DataStructure();
        ds.printEven();
        ds.getIterator();
        System.out.println("Number of iterators: " + EvenIterator.noInterators);
    }
}
