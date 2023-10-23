package inheritance.geometry;

import java.awt.*;

public class Circle extends GeometricObject {
    private double radius;

    public Circle(double radius) {
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
        return 2 * radius * Math.PI;
    }

    /* Print the circle info */
    public String toString() {
        return super.toString()+"\nThe circle wass created " + getDateCreated()
                + " and the radius is " + radius;
    }
}
