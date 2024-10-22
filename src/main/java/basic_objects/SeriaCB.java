package basic_objects;

public class SeriaCB {
    private Integer noStudents;

    public SeriaCB() {
        this(128);
    }

    private SeriaCB(int noStudents) {
        this.noStudents = noStudents;
    }

    public int getNoStudents() {
        return noStudents;
    }

    public void setNoStudents(int noStudents) {
        this.noStudents = noStudents;
    }

    public static void increment(SeriaCB x, int y) {
        x.noStudents += y;
    }

    public void increment(int y) {
        this.noStudents += y;
    }

    public void increment() {
        SeriaCB.increment(this,10);
    }

    public static void main(String[] args) {
        SeriaCB s1 = new SeriaCB();
        s1.increment();
        increment(s1, 20);
        System.out.println(s1.getNoStudents());
    }
}
