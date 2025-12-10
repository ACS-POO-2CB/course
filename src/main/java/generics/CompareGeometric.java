package generics;

import abstract_interface.geometry.AbstractGeometricObject;
import abstract_interface.geometry.ComparableRectangle;

import java.util.ArrayList;
import java.util.List;

public class CompareGeometric {
    public static <E extends AbstractGeometricObject & Comparable<E>> boolean equalArea(E object1, E object2) {
        return object1.getArea() == object2.getArea();
    }

    public static void main(String[] args) {
        List<AbstractGeometricObject> aList = new ArrayList<>();

        ComparableRectangle rectangle1 = new ComparableRectangle(2, 4);
        ComparableRectangle rectangle2 = new ComparableRectangle(3, 5);
        System.out.println("The two rectangles have the same area? " + equalArea(rectangle1, rectangle2));
    }
}
