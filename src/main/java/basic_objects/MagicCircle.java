package basic_objects;

public class MagicCircle {
    // The radius of this circle
    double radius;
    String color;

    public MagicCircle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public MagicCircle(float radius, String color) {
        this((double) radius, color);
    }

    public MagicCircle() {
        this(1, "blue");
    }

    public MagicCircle(double radius) {
        this(radius, "green");
    }

    double getArea() {
        return Math.PI * Math.pow(radius, 2);
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
        return "MagicCircle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    static void facemCeva(MagicCircle magicCircle) {
        System.out.println("Ceva awesome!");
    }

    void facemCeva() {
        facemCeva(this);
    }

    public static void main(String[] args) {
        MagicCircle circle1 = new MagicCircle();
        MagicCircle circle3, circle4, circle2;
        circle4 = circle3 = circle2 = new MagicCircle();
        System.out.println(circle1.toString() + " " + circle2);


//        circle1=circle2=null;
//        System.out.println(circle1 + " " + circle2);
//        System.out.println(circle1==circle2);
        circle1.facemCeva();
        System.out.println(circle1.color + " " + circle1.radius + " " + circle1.getArea());
    }
}