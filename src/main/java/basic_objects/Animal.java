package basic_objects;

import java.lang.ref.Cleaner;

/**
 * Example showing how to use Java's Cleaner API to release cleanup work
 * when an object becomes phantom-reachable.
 */
public class Animal {

    private static final Cleaner CLEANER = Cleaner.create();
    private static int animalCount;

    private final long weight;
    private boolean herbivore;
    private final Cleaner.Cleanable cleanable;

    public Animal(long weight, boolean herbivore) {
        this.weight = weight;
        this.herbivore = herbivore;
        animalCount++;
        this.cleanable = CLEANER.register(this, Animal::releaseAnimalResources);
    }

    public Animal(long weight) {
        this(weight, true);
    }

    public long getWeight() {
        return weight;
    }

    public boolean isHerbivore() {
        return herbivore;
    }

    public void setHerbivore(boolean herbivore) {
        this.herbivore = herbivore;
    }

    private static void releaseAnimalResources() {
        animalCount--;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", herbivore=" + herbivore +
                '}';
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Initial count: " + animalCount);

        Animal rhino = new Animal(200, true);
        Animal bunny = new Animal(100, true);

        System.out.println(rhino + " " + bunny);
        System.out.println("Current animals: " + animalCount);

        rhino.cleanable.clean();
        bunny.cleanable.clean();

        System.out.println("Animals after cleanup pass: " + animalCount);

        for (int i = 0; i < 10_000_000; i++) {
            new Animal(200, true);
        }

        Thread.sleep(1000);

       System.out.println("All present animals: " + animalCount);
    }
}

