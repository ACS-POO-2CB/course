package basic_objects;

public class CB {
    private Integer noStudents;

    public CB() {
        this(120);
    }

    private CB(int noStudents) {
        this.noStudents = noStudents;
    }

    public int getNoStudents() {
        return noStudents;
    }

    public void setNoStudents(int noStudents) {
        this.noStudents = noStudents;
    }

    public static void increment(CB x, int y) {
        x.noStudents += y;
    }

    public void increment(int y) {
//        this.noStudents += y;
        CB.increment(this, y);
    }

    public void increment() {
        this.increment(10);
    }

    public static void main(String[] args) {
        CB s1 = new CB();
        s1.increment();
        increment(s1, 20);
        System.out.println(s1.getNoStudents());
    }
}
