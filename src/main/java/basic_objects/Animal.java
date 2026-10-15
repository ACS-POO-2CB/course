package basic_objects;

import java.awt.Color;
import java.lang.ref.Cleaner;

/**
 * O clasa foarte utila care descrie un animal
 *
 * @author Mihai Dascalu
 * @version 1.0
 * @since 1.0
 */
public class Animal {

    private long weight;
    boolean isHerbivor;
    static int noAnimals;

    // TODO add cleaner
    private static final Cleaner cleaner = Cleaner.create();
    private Cleaner.Cleanable cleanable;

    public Animal(long weight, boolean isHerbivor) {
        this.weight = weight;
        this.isHerbivor = isHerbivor;
        noAnimals++;
        // Register the cleaning action
        cleanable = cleaner.register(this, Animal::deleteAnimal); //method reference operator
    }

    public Animal(long weight) {
        this(weight, true);
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public boolean isHerbivor() {
        return isHerbivor;
    }

    public void setHerbivor(boolean herbivor) {
        isHerbivor = herbivor;
    }

    public static void deleteAnimal() {
        noAnimals--;
    }

    //please do not use this method
//    @Override
//    protected void finalize() throws Throwable {
//        deleteAnimal();
//    }

    public static void main(String[] args) throws Throwable {
        System.out.println(noAnimals);
        Animal rhino = new Animal(200, true);

        Animal hophop = new Animal(100, true);

        System.out.println(rhino + " " + hophop);
        System.out.println("Going wild with animals:" + noAnimals);

        Animal animal;
        for (int i = 0; i < Math.pow(10,7); i++) {
            animal = new Animal(200, true);
        }

        Thread.sleep(1000); // Give the cleaner time to run

        System.out.println(noAnimals);
    }
}

