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

    public void printSpecial(Iterator<Integer> iterator) {
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    public Iterator<Integer> getIterator() {
        return new EvenIterator();
    }

    public static void process() {
        EvenIterator ev = new DataStructure().new EvenIterator();
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
            return (nextIndex < SIZE);
        }

        public Integer next() {
            Integer retValue = DataStructure.this.arrayOfInts[nextIndex];
            nextIndex += 2;
            return retValue;
        }
    }

    public class Iterator3 extends EvenIterator {
        private int nextIndex = 0;

        public boolean hasNext() {
            return (nextIndex < SIZE-2);
        }

        public Integer next() {
            Integer retValue = arrayOfInts[nextIndex];
            nextIndex += 3;
            return retValue;
        }
    }

    public static void main(String[] s) {
        DataStructure ds1 = new DataStructure();
        DataStructure.EvenIterator ei1 = ds1.new EvenIterator();
        ds1.printSpecial(ei1);
        ds1.printSpecial(ds1.getIterator());
        ds1.printSpecial(ds1.new EvenIterator());
        ds1.printSpecial(ds1.new Iterator3());

        DataStructure ds2 = new DataStructure();
        ds2.printSpecial(ds2.getIterator());
        ds2.printSpecial(ds2.new EvenIterator());

        System.out.println("Number of iterators: " + DataStructure.EvenIterator.noInterators);
    }
}