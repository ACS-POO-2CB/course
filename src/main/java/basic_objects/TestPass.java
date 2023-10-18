package basic_objects;

public class TestPass {

    /**
     * Main method
     */
    public static void main(String[] args) {
        Circle myCircle = new Circle(1);
        int n = 5;
        printAreas(myCircle, n);
        System.out.println("R = " + myCircle.getRadius());
        System.out.println("n = " + n);
    }

    /**
     * Print a table of areas for radius
     */
    public static void printAreas(Circle c, int times) {
        System.out.println("Radius\tArea");
        while (times >= 1) {
            System.out.println(c.getRadius() + "\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }
}

