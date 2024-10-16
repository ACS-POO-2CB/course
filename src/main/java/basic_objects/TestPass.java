package basic_objects;

public class TestPass {


    /**
     * Print a table of areas for radius
     */
    public static void printAreas(MagicCircle c, int n) {
        System.out.println("Radius\tArea");
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

