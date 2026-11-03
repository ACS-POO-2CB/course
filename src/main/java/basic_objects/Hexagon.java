package basic_objects;

// This example demonstrates how object references work and how static fields are shared.
public class Hexagon {

    // Counts how many Hexagon objects were created.
    private static int createdHexagons;

    static {
        createdHexagons = -1;
    }

    static {
        createdHexagons = 0;
    }

    private int edge;

    public Hexagon(int edge) {
        this.edge = edge;
        createdHexagons++;
    }

    public int getEdge() {
        return edge;
    }

    public static void changeHexagon(Hexagon[] hexagons) {
        Hexagon newHexagon = new Hexagon(2);
        hexagons[0] = newHexagon;
        hexagons[0].edge = 10;
    }

    @Override
    public String toString() {
        return "Hexagon{" +
                "edge=" + edge +
                '}';
    }

    public static void main(String[] args) {
        Hexagon firstHexagon = new Hexagon(100);
        Hexagon[] hexagons = {firstHexagon, firstHexagon, firstHexagon};

        System.out.println("Initial array: " + hexagons[0]);

        hexagons[0].edge = 50;
        System.out.println("After modifying first / last hexagon edge: " + hexagons[2].edge);

        Hexagon.changeHexagon(hexagons);
        System.out.println("After replace: " + hexagons[0]);
        System.out.println("Created hexagons: " + createdHexagons);
    }
}
