package basic_objects;

import java.awt.Color;

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
    private long greutate;
    boolean isIerbivor;

    /**
     * culoarea animalului care poate fi absolut orice, inclusiv null
     */
    private Color culoare;
    private String denumire;
    static int nrAnimale;

    /**
     * Constructorul default
     *
     * @param greutate   greutatea animalului
     * @param isIerbivor daca animalul este ierbivor sau nu
     * @param culoare    culoarea animalului
     * @param denumire   denumirea animalului
     */
    public Animal(long greutate, boolean isIerbivor, Color culoare, String denumire) {
        this.greutate = greutate;
        this.isIerbivor = isIerbivor;
        this.culoare = culoare;
        this.denumire = denumire;
        nrAnimale++;
    }

    public Animal(long greutate, boolean isIerbivor, String denumire) {
        this(greutate, isIerbivor, Color.PINK, denumire);
    }

    //TODO add other colors

    public long getGreutate() {
        return greutate;
    }

    public void setGreutate(long greutate) {
        this.greutate = greutate;
    }

    public boolean isIerbivor() {
        return isIerbivor;
    }

    public void setIerbivor(boolean ierbivor) {
        isIerbivor = ierbivor;
    }

    public Color getCuloare() {
        return culoare;
    }

    public void setCuloare(Color culoare) {
        this.culoare = culoare;
    }

    @Override
    /**
     * @return o reprezentare a obiectului sub forma de string
     */ public String toString() {
        return this.denumire;
    }

    public static void sterge1Animal() {
        nrAnimale--;
    }

    // solution - use Cleaner
    @Override
    protected void finalize() throws Throwable {
        nrAnimale--;
    }

    public static void main(String[] args) throws Throwable {
        System.out.println(nrAnimale);
        Animal rinocer = new Animal(200, true, "rinocer");

        Animal veverita = new Animal(2, true, Color.BLUE, "super veverita") {
            public void anaAreMere() {
                System.out.println("Ana are mere");
            }

            public String toString() {
                anaAreMere();
                return "supe super veverita";
            }
        };

        Animal cangur = new Animal(100, true, "Kangur");

        System.out.println(rinocer + " " + veverita + " " + cangur);
        System.out.println("Going wild with animals:" + nrAnimale);

        Animal animal;
        for (int i = 0; i < 100000; i++) {
            animal = new Animal(200, true, "rinocer");
//            System.gc();
//            Animal.sterge1Animal();
        }
        System.out.println(nrAnimale);
    }
}
