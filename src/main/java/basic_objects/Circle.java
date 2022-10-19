package basic_objects;

class Circle {
    /** The radius of this circle */
    double radius;

    /** Construct a circle object */
    public Circle(double radius) {
        this.radius = radius;
    }

    /** Return the area of this circle */
    double getArea() {
        return radius * radius * 3.14159;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        System.out.println(circle1.radius+" "+circle1.getArea());
    }
}