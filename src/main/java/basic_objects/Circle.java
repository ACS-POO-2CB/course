package basic_objects;

public class Circle {
    // The radius of this circle
    double radius;
    String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Circle(float radius, String color) {
        this((double) radius, color);
    }

    public Circle() {
        this(1, "blue");
    }

    public Circle(double radius) {
        this(1, "green");
    }


    double getArea() {
        return Math.PI*Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        System.out.println(circle1.toString() + " " + circle2);

//        circle1=circle2=null;
//        System.out.println(circle1 + " " + circle2);
//        System.out.println(circle1==circle2);
        System.out.println(circle1.color + " " + circle1.radius + " " + circle1.getArea());
    }
}