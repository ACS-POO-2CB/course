package abstract_interface.geometry;

public class ComparableRectangle extends NewRectangle implements Comparable<ComparableRectangle> {
    /**
     * Construct a ComparableRectangle with specified properties
     */
    public ComparableRectangle(double width, double height) {
        super(width, height);
    }

    /**
     * Implement the compareTo method defined in Comparable
     */
    public int compareTo(ComparableRectangle o) {
        return (int) Math.signum(this.getArea() - o.getArea());
    }

    public static ComparableRectangle max(ComparableRectangle o1, ComparableRectangle o2) {
        return (o1.compareTo(o2) > 0) ? o1 : o2;
    }

    @Override
    public String toString() {
        return "ComparableRectangle [getArea()=" + getArea() + "]";
    }

    public static void main(String[] args) {
        ComparableRectangle rectangle1 = new ComparableRectangle(4, 5);
        ComparableRectangle rectangle2 = new ComparableRectangle(3, 6);
        System.out.println(max(rectangle1, rectangle2));
    }
}
