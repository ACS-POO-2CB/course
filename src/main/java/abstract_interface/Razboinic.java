package abstract_interface;

interface Erou {
    default String getStrigatDeLupta() {
        return "Uraaaaaaaa!";
    }
    static String activeazaAuraSabiei() {
        return "S-a activat aura sabiei DPS+2";
    }
}

interface Spartan {
    //TODO change to default or even return void
    private String getStrigatDeLupta() {
        return "This is Spartaaaa!";
    }
    default String getStrigat() {
        return getStrigatDeLupta();
    }
    static String activeazaAuraSabiei() {
        return "S-a activat aura sabiei DPS+9";
    }
}

public class Razboinic implements Erou, Spartan{

    public static void main(String[] args) {
        Razboinic r= new Razboinic();
        System.out.println(r.getStrigatDeLupta());
        System.out.println(r.getStrigat());
        System.out.println(Erou.activeazaAuraSabiei());
        System.out.println(Spartan.activeazaAuraSabiei());
    }
}
