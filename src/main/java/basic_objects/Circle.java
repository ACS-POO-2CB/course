package basic_objects;

class Circle {
    /**
     * The radius of this circle
     */
    double radius;
    String culoare;

    public Circle(float radius, String culoare) {
        this.radius = radius;
        this.culoare = culoare;
    }

    public Circle() {
        this(1, "albastru");
    }

    public Circle(double radius, String culoare) {
        this();
    }

    double getArea() {
        return radius * radius * 3.14159;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", culoare='" + culoare + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        System.out.println(circle1.toString() + " " + circle2);

//        circle1=circle2=null;
//        System.out.println(circle1 + " " + circle2);
//        System.out.println(circle1==circle2);
        System.out.println(circle1.culoare + " " + circle1.radius + " " + circle1.getArea());
    }
}