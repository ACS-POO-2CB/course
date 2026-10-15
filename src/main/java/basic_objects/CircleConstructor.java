package basic_objects;

public class CircleConstructor {

    double radius = 1.0;

    CircleConstructor() {
        this(1);
    }

    CircleConstructor(double newRadius) {
//        this();
        radius = newRadius;
    }

    CircleConstructor CircleConstructor() {
        return new CircleConstructor();
    }

    double getArea() {
        return radius * radius * 3.14159;
    }

    static void main(String[] args) {
        CircleConstructor circle1 = new CircleConstructor();

        IO.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());

        IO.println(new CircleConstructor().CircleConstructor().CircleConstructor());
    }
}