package collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import abstract_interface.geometry.NewCircle;
import abstract_interface.geometry.AbstractGeometricObject;
import abstract_interface.geometry.NewRectangle;

public class GeometricObjectComparator implements Comparator<AbstractGeometricObject> {

    public int compare(AbstractGeometricObject o1, AbstractGeometricObject o2) {
        double area1 = o1.getArea();
        double area2 = o2.getArea();

        if (area1 < area2)
            return -1;
        else if (area1 == area2)
            return 0;
        return 1;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        // Create a tree set for geometric objects using a comparator
        // Set<GeometricObject> set = new TreeSet<GeometricObject>(new
        // GeometricObjectComparator());

        Set<AbstractGeometricObject> set = new TreeSet(new Comparator<AbstractGeometricObject>() {
            public int compare(AbstractGeometricObject o1, AbstractGeometricObject o2) {
                double area1 = o1.getArea();
                double area2 = o2.getArea();

                if (area1 > area2)
                    return -1;
                else if (area1 == area2)
                    return 0;
                return 1;
            }
        });
        set.add(new NewRectangle(8, 5));
        set.add(new NewCircle(40));
        set.add(new NewCircle(40));
        set.add(new NewRectangle(4, 1));

        // Display geometric objects in the tree set
        System.out.println("A sorted set of geometric objects");
        for (AbstractGeometricObject element : set)
            System.out.println("Area = " + element.getArea());
    }
}