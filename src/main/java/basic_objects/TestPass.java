package basic_objects;

public class TestPass {
    /**
     * Print a table of areas for radius
     */
    public static void printAreas(MagicCircle c, int n) {
        c.setRadius(20);
        System.out.println("Radius\tArea");
        c = new MagicCircle(10);
        while (n >= 1) {
            System.out.println(c.getRadius() + "\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            n--;
        }
    }

    /**
     * Main method
     */
    public static void main(String[] args) {
        MagicCircle myCircle = new MagicCircle(1);
        int n = 5;
        printAreas(myCircle, n);
        System.out.println("R = " + myCircle.getRadius());
        System.out.println("n = " + n);
    }
}

