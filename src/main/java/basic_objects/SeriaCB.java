package basic_objects;

public class SeriaCB {
    private Integer nrStudenti;

    public SeriaCB() {
        this(124);
    }

    private SeriaCB(int nrStudenti) {
        this.nrStudenti = nrStudenti;
    }

    public int getNrStudenti() {
        return nrStudenti;
    }

    public void setNrStudenti(int nrStudenti) {
        this.nrStudenti = nrStudenti;
    }

    public static void incrementeaza(SeriaCB x, int y) {
        x.nrStudenti += y;
    }

    public void incrementeaza() {
        SeriaCB.incrementeaza(this,10);
    }

    public static void main(String[] args) {
        SeriaCB s1 = new SeriaCB();
        s1.incrementeaza();
        incrementeaza(s1, 20);
        System.out.println(s1.getNrStudenti());
    }
}
