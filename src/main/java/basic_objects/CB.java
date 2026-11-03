package basic_objects;

public class CB {
    private Integer noStudents;

    public CB() {
        this(100);
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

    public static void increment(CB series, int y) {
        series.noStudents += y;
    }

    public void increment(int y) {
//        this.noStudents += y;
        CB.increment(this, y);
    }

    public void increment() {
        this.increment(10);
    }

    public static void main(String[] args) {
        CB cb = new CB();
        cb.increment();
        increment(cb, 20);
        System.out.println(cb.getNoStudents());
    }
}
