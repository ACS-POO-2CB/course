package inheritance;

public class Baltagul extends Morometii {

    private String transhumanta;
    String ilie;

    Baltagul(String x) {
        super(x);
        ilie = "Iliuta";
        super.ilie = "Super Ilie";
        transhumanta = x;
    }

    public void setIlie(String ilie) {
        super.setIlie("Super " + ilie);
    }

    public String getIlie() {
        return "Am obosit, prea multi Ilie!";
    }

    public static void verifica(Object m) {
        System.out.println(((Baltagul) m).ilie);
        System.out.println(((Morometii) m).ilie);
        System.out.println(((Baltagul) m).getIlie());
        System.out.println(((Morometii) m).getIlie());
    }

    public static void main(String[] args) {
        Baltagul b = new Baltagul("Ilie generic");
        System.out.println(b.ilie);
        System.out.println(b.getIlie());
        System.out.println("-----------------");

        verifica(b);
        System.out.println("-----------------");

        b.setIlie("mega ilie");
        System.out.println(b.getIlie());
        verifica(b);
    }
}

class Morometii {

    String ilie;

    public Morometii(String ilie) {
        this.ilie = ilie;
    }

    public String getIlie() {
        return ilie;
    }

    public void setIlie(String ilie) {
        this.ilie = ilie;
    }

}
