package inheritance;

public class Profesor extends Om {
    int varsta;

    public Profesor(int varsta) {
        super(varsta);
        this.varsta = 3 * varsta;
    }

    public void vorbeste() {
        System.out.println("5 ai trecut!");
        super.vorbeste();
    }

    public static void main(String[] args) {
        Profesor profesor = new Profesor(20);
        System.out.println(profesor.varsta);
        System.out.println(((Om) profesor).varsta);
        System.out.println(((Fiinta) profesor).varsta);

        profesor.vorbeste();
        ((Om) profesor).vorbeste();
        ((Fiinta) profesor).vorbeste();
    }
}

class Om extends Fiinta {
    int varsta;

    public Om(int varsta) {
        super(varsta);
        this.varsta = 2 * varsta;
    }

//    public void vorbeste() {
//        System.out.println("Urmeaza statia Politehnica cu peronul pe partea stanga!");
//        super.vorbeste();
//    }
}

class Fiinta {
    int varsta;

    public Fiinta(int varsta) {
        this.varsta = varsta;
    }

    public void vorbeste() {
        System.out.println("I am alive!");
    }
}