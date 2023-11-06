package abstract_interface.geometry;

import java.awt.*;

public class NewCircle extends AbstractGeometricObject {
    private double radius;

    public NewCircle(double radius) {
        super(Color.BLUE.toString(), false);
        this.radius = radius;
    }

    /**
     * Return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Set a new radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Return area
     */
    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    /**
     * Return diameter
     */
    public double getDiameter() {
        return 2 * radius;
    }

    /**
     * Return perimeter
     */
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Un cerc extraordinar";
    }

    /* Print the circle info */
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
    }
}
