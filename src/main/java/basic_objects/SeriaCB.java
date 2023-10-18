package basic_objects;

public class SeriaCB {
    private Integer nrStudenti;
    public SeriaCB() {
        this(100);
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

    public static void incrementeaza(SeriaCB x) {
        x.setNrStudenti(x.getNrStudenti() + 10);
    }

    public void incrementeaza() {
        SeriaCB.incrementeaza(this);
    }

    public static void main(String[] args) {
        SeriaCB s1 = new SeriaCB(120);
        s1.incrementeaza();
        System.out.println(s1.getNrStudenti());
    }
}
