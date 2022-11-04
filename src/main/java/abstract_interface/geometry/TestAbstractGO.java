package abstract_interface.geometry;

public class TestAbstractGO {
    /**
     * Main method
     */
    public static void main(String[] args) {
        // Declare and initialize two geometric objects
        AbstractGeometricObject geoObject1 = new NewCircle(5);
        AbstractGeometricObject geoObject2 = new NewRectangle(5, 3);
        AbstractGeometricObject geoObject3 = new AbstractGeometricObject() {
            @Override
            public double getArea() {
                return 0;
            }

            @Override
            protected double getPerimeter() {
                return 0;
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
