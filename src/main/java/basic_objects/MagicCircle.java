package basic_objects;

public class MagicCircle {
    // The radius of this circle
    double radius;
    String color;

    public MagicCircle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public MagicCircle() {
        this(1d, "red");
    }

    public MagicCircle(double radius) {
        this(radius, "green");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "MagicCircle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    static void doSomething(MagicCircle magicCircle) {
        System.out.println("Awesome!" + magicCircle.getRadius() + " " + magicCircle.getColor());
    }

    void doSomething() {
        doSomething(this);
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        MagicCircle circle1 = new MagicCircle();
        MagicCircle circle3, circle4, circle2;
        circle4 = circle3 = circle2 = new MagicCircle();
        circle3.setRadius(20);
        System.out.println(circle4.getRadius());

        System.out.println(circle1.toString() + " " + circle2);

        circle1=circle2=null;
        System.out.println(circle1 + " " + circle2);
        System.out.println(circle1==circle2);

        circle3.doSomething();
        System.out.println(circle3.color + " " + circle3.radius);
    }
}