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

    /**
     * greutatea animalului in kg
     */
    private long weight;
    boolean isHerbivor;
    static int noAnimals;

    // Cleaner instance
    private static final Cleaner cleaner = Cleaner.create();
    private Cleaner.Cleanable cleanable;

    /**
     * Constructorul default
     *
     * @param weight     greutatea animalului
     * @param isHerbivor daca animalul este ierbivor sau nu
     */
    public Animal(long weight, boolean isHerbivor) {
        this.weight = weight;
        this.isHerbivor = isHerbivor;
        noAnimals++;
        // Register the cleaning action
        cleanable = cleaner.register(this, Animal::deleteAnimal); //method reference operator
    }

    public Animal(long greutate) {
        this(greutate, true);
    }

    //TODO add other colors

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
//        noAnimals--;
//    }

    public static void main(String[] args) throws Throwable {
        System.out.println(noAnimals);
        Animal rinocer = new Animal(200, true);

        Animal cangur = new Animal(100, true);

        System.out.println(rinocer + " " + cangur);
        System.out.println("Going wild with animals:" + noAnimals);

        Animal animal;
        for (int i = 0; i < 1000000; i++) {
            animal = new Animal(200, true);
//            Animal.sterge1Animal();
        }

//        Thread.sleep(10000);
        System.out.println(noAnimals);
    }
}

