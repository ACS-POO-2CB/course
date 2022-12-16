package generics;

import abstract_interface.edible.Edible;
import abstract_interface.geometry.AbstractGeometricObject;
import abstract_interface.geometry.NewCircle;
import abstract_interface.geometry.NewRectangle;

import java.util.ArrayList;
import java.util.List;

public class CompareGeometric {
    public static <E extends AbstractGeometricObject> boolean equalArea(E object1, E object2) {
        return object1.getArea() == object2.getArea();
    }

    public static void main(String[] args) {
        List<AbstractGeometricObject> aList = new ArrayList<AbstractGeometricObject>();

        aList.add(new NewRectangle(1, 1));

        NewCircle circle1 = new NewCircle(2);
        NewCircle circle2 = new NewCircle(3);
        System.out.println("The two circles have the same area? " + equalArea(circle1, circle2));

        NewRectangle rectangle1 = new NewRectangle(2, 4);
        NewRectangle rectangle2 = new NewRectangle(3, 5);
        System.out.println("The two rectangles have the same area? " + equalArea(rectangle1, rectangle2));

        System.out.println("The two objects have the same area? " + equalArea(circle1, rectangle1));
    }
}
