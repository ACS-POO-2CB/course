package basic_objects;

//O clasa prea urata pentru a fi scrisa vreodata
public class Hexagon {

    static int no1;

    static {
        no1 = -1;
    }

    static {
        no1 = 0;
    }

    int edge;

    /**
     * Default constructor
     *
     * @param edge
     */
    public Hexagon(int edge) {
        this.edge = edge;
        no1++;
    }

    public int getEdge() {
        return edge;
    }

    public static void changeHexagon(Hexagon[] h) {
        Hexagon h2 = new Hexagon(2);
        h[0] = h2;
        h[0].edge = 10;
    }

    @Override
    public String toString() {
        return "Hexagon{" +
                "edge=" + edge +
                '}';
    }

    public static void main(String[] args) {
        Hexagon h1 = new Hexagon(100);
        Hexagon[] vect = {h1,h1,h1};
        //Arrays.asList(h1,h1).toArray(new Hexagon[]{})

        System.out.println(vect[0]);
        h1.edge =50;
        System.out.println(vect[2].edge);

        Hexagon.changeHexagon(vect);
        System.out.println(vect[0]);
        System.out.println(no1);
    }
}
