package basic_objects;

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

    int edge;
    int diagonal;

    /**
     * Constructorul implicit
     *
     * @param edge
     * @param diagonal
     */
    public Hexagon(int edge, int diagonal) {
        this.edge = edge;
        this.diagonal = diagonal;
        no1++;
    }

    public int getEdge() {
        return edge;
    }

    public static void changeHexagon(Hexagon[] h) {
        Hexagon h2 = new Hexagon(2, 2);
        h[0] = h2;
        h[0].edge = 100;
    }

    public static void changeString(String text) {
        text += "a";
    }

    
    public static void changeInteger(Integer x) {
        x++;
    }
    @Override
    public String toString() {
        return "Hexagon{" +
                "edge=" + edge +
                ", diagonal=" + diagonal +
                '}';
    }

    public static void main(String[] args) {
        Hexagon h1 = new Hexagon(10, 10);
        Hexagon[] vect = {h1,h1};
        //Arrays.asList(h1,h1).toArray(new Hexagon[]{})

        System.out.println(vect[0]);

        Hexagon.changeHexagon(vect);
        System.out.println(vect[0]);
        System.out.println(no1 + " " + no2);

        String text = "hexagon";
        changeString(text);
        System.out.println(text);

        Integer x=10;
        changeInteger(x);
        System.out.println(x);
    }
}
