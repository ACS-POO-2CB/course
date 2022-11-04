package abstract_interface.geometry;

public class NewRectangle extends AbstractGeometricObject {
    private double width;
    private double height;

    public NewRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * Set a new width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Set a new height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Return area
     */
    @Override
    public double getArea() {
        return width * height;
    }

    /**
     * Return perimeter
     */
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
