package abstract_interface.geometry;

public class TestAbstractGO {
    /**
     * Main method
     */
    public static void main(String[] args) {
        // Declare and initialize two geometric objects
        AbstractGeometricObject geoObject1 = new NewCircle(5);
        System.out.println(geoObject1);

        AbstractGeometricObject geoObject2 = new NewRectangle(5, 3);
        System.out.println(geoObject2);

        AbstractGeometricObject geoObject3 = new AbstractGeometricObject() {
            private int width = 10;

            @Override
            public double getArea() {
                return width * width;
            }

            @Override
            public double getPerimeter() {
                return 4 * width;
            }

            @Override
            public String toString() {
                return "A square with width " + width;
            }
        };

        System.out.println("The two objects have the same area? " + equalArea(geoObject1, geoObject2));

        // Display circle
        displayGeometricObject(geoObject1);

        // Display rectangle
        displayGeometricObject(geoObject2);

        // Display geometric object
        displayGeometricObject(geoObject3);
    }

    /**
     * A method for comparing the areas of two geometric objects
     */
    public static boolean equalArea(AbstractGeometricObject object1, AbstractGeometricObject object2) {
        return object1.getArea() == object2.getArea();
    }

    /**
     * A method for displaying a geometric object
     */
    public static void displayGeometricObject(AbstractGeometricObject object) {
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }
}
