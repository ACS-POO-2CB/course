package inheritance.geometry;

public class TestGeometricObject {
    /**
     * Main method
     */

    public static void main(String[] args) {
        // Declare and initialize two geometric objects
        Circle geoObject1 = new Circle(5);
        Rectangle geoObject2 = new Rectangle(5, 3);
        GeometricObject[] vector = {geoObject1, geoObject2};

        // Display circle
        System.out.println(geoObject1.getColor() + " " +
                +geoObject1.getRadius() + " " +
                geoObject1.getArea());

        // Display rectangle
        System.out.println(vector[1].getColor() + " "
                        + ((Rectangle) vector[1]).getWidth() + " " +
                        +((Rectangle) vector[1]).getHeight() + " "
//                +((Circle)vector[1]).getArea()
        );

        for (GeometricObject go : vector) {
            System.out.println(go.getColor() + " " + go.getDateCreated());
        }

    }
}
