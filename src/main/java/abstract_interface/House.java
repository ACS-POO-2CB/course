package abstract_interface;

import java.util.Date;

/**
 * @author mihaidascalu
 */
public class House implements Cloneable, Comparable<House> {
    private int id;
    /**
     * Aria unei case
     */
    private double area;
    private java.util.Date whenBuilt;

    /**
     * Default constructor
     * @param id   identifier
     * @param area needs to be used
     */
    public House(int id, double area) {
        this.id = id;
        this.area = area;
        whenBuilt = new java.util.Date();
    }

    /**
     * @return identificator
     */
    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public java.util.Date getWhenBuilt() {
        return whenBuilt;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setWhenBuilt(java.util.Date whenBuilt) {
        this.whenBuilt = whenBuilt;
    }

    /**
     * Implement the compareTo method defined in Comparable
     */
    public int compareTo(House o) {
        if (this.area > o.area)
            return 1;
        else if (this.area < o.area)
            return -1;
        else
            return 0;
    }

    public static void main(String[] args) throws Exception {
        House house1 = new House(1, 1750.50);
        House house2;
        Thread.sleep(1000);

        house2 = (House) house1.clone();

        System.out.println(house1.getId() + " vs " + house2.getId());

        System.out.println(house1.getWhenBuilt() + " vs " + house2.getWhenBuilt());

        System.out.println(house1.getWhenBuilt() == house2.getWhenBuilt());
    }

//        public Object clone() throws CloneNotSupportedException {
//        // Perform a shallow copy
//        House obj = (House) super.clone();
//        // Deep copy on whenBuilt
//        obj.setWhenBuilt(new Date());
//        obj.setId(obj.getId()+1);
//        return obj;
//    }
}