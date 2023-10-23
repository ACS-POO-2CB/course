package basic_objects;

import java.util.Arrays;

//O clasa prea urata pentru a fi scrisa vreodata
public class Hexagon {

    static int no1, no2;

    static {
        no1 = -1;
        no2 = -1;
    }

    static {
        no1 = 0;
        no2 = 0;
    }

    int latura;
    int diagonala;

    /**
     * Constructorul implicit
     *
     * @param latura
     * @param diagonala
     */
    public Hexagon(int latura, int diagonala) {
        this.latura = latura;
        this.diagonala = diagonala;
        no1++;
    }

    public int getLatura() {
        return latura;
    }

    public static void schimbaHexagon(Hexagon[] h) {
        Hexagon h2 = new Hexagon(2, 2);
        h[0] = h2;
        h2.latura = 100;
    }

    public static void schimbaString(String text) {
        text += "a";
    }

    public static void schimbaInteger(Integer x) {
        x++;
    }
    @Override
    public String toString() {
        return "Hexagon{" +
                "latura=" + latura +
                ", diagonala=" + diagonala +
                '}';
    }

    public static void main(String[] args) {

        Hexagon h1 = new Hexagon(10, 10);
        Hexagon[] vect = {h1,h1};
        //Arrays.asList(h1,h1).toArray(new Hexagon[]{})

        System.out.println(vect[0]);

        Hexagon.schimbaHexagon(vect);
        System.out.println(vect[0]);
        System.out.println(no1 + " " + no2);

        String text = "hexagon";
        schimbaString(text);
        System.out.println(text);

        Integer x=10;
        schimbaInteger(x);
        System.out.println(x);
    }
}
