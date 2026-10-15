package basic_objects;

//O clasa prea urata pentru a fi scrisa vreodata
public class Hexagon {

    static int no;

    static {
        no = -1;
    }

    static {
        no = 0;
    }

    int edge;

    /**
     * Default constructor
     *
     * @param edge
     */
    public Hexagon(int edge) {
        this.edge = edge;
        no++;
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
        Hexagon[] array = {h1,h1,h1};
        //Arrays.asList(h1,h1).toArray(new Hexagon[]{})

        System.out.println(array[0]);
        h1.edge =50;
        System.out.println(array[2].edge);

        Hexagon.changeHexagon(array);
        System.out.println(array[0]);
        System.out.println(no);
    }
}
