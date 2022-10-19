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

    /** greutatea animalului in kg */
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
     * @param greutate greutatea animalului
     * @param isIerbivor daca este ierbivor sau nu
     * @param culoare culoarea animalului
     * @param denumire denumirea animalului
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

    public long getGreutate() {
        return greutate;
    }

    /**
     * @param greutate greutatea animalului nostru
     */
    public void setGreutate(long greutate) {
        this.greutate = greutate;
    }

    public boolean isIerbivor() {
        return isIerbivor;
    }

    public void setIerbivor(boolean isIerbivor) {
        this.isIerbivor = isIerbivor;
    }

    public Color getCuloare() {
        return culoare;
    }

    public void setCuloare(Color culoare) {
        this.culoare = culoare;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getNrAnimale() {
        return Animal.nrAnimale;
    }

    @Override
    public String toString() {
        return this.denumire;
    }

    @Override
    protected void finalize() throws Throwable {
        //solution - use Cleaner
        //nrAnimale--;
    }

    public static void main(String[] args) throws Throwable {
        System.out.println(nrAnimale);
        Animal rinocer = new Animal(200, true, "rinocer");

        Animal veverita = new Animal(2, true, Color.BLUE, "super veverita");
//        {
//            public String toString() {
//                return "veverita super super super cool";
//            }
//        };

        System.out.println(rinocer + " " + veverita + " " + veverita);
        System.out.println(nrAnimale);

        for (int i = 0; i < 1000000; i++)
            rinocer = new Animal(200, true, "rinocer");
        System.out.println(nrAnimale);
    }
}
