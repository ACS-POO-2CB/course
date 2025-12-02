package abstract_interface;

import java.util.Date;

public class Max {
    // Max.java: Find a maximum object
    public static Object max(Object o1, Object o2) {
        if ((o1 instanceof Comparable aux) && (aux.compareTo(o2) > 0))
            return o1;
        return o2;
    }

    // Max.java: Find a maximum object
    public static Comparable max(Comparable o1, Comparable o2) {
        if (o1.getClass() != o2.getClass())
            return null;
        if (o1.compareTo(o2) > 0)
            return o1;
        return o2;
    }

//    public static <T extends Comparable<T>> T maxim (T o1, T o2) {
//        if (o1.compareTo(o2) > 0)
//            return o1;
//        return o2;
//    }

    public static void main(String[] args) {
        Date d1 = new Date();
        Date d2 = new Date();

        String s1 = "abc";
        String s2 = "def";

        System.out.println("Max date is " + max(d1, d2));

        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));

//        System.out.println(max(s1, d2));
        System.out.println(max(s1, d2.toString()));

//        System.out.println(maxim(s1,d2));
    }

}
