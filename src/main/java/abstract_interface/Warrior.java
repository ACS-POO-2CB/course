package abstract_interface;

interface Hero {
    default String getWarCry() {
        return "Uraaaaaaaa!";
    }
    static String activateSwordAura() {
        return "S-a activat aura sabiei DPS+2";
    }
}

interface Spartan {
    //TODO change to default or even return void
    private String getWarCry() {
        return "This is Sparta!";
    }
    default String shout() {
        return getWarCry();
    }
    static String activateSwordAura() {
        return "S-a activat aura sabiei DPS+9";
    }
}

public class Warrior implements Hero, Spartan{
    public static void main(String[] args) {
        Warrior r= new Warrior();
        System.out.println(r.getWarCry());
        System.out.println(r.shout());
        System.out.println(Hero.activateSwordAura());
        System.out.println(Spartan.activateSwordAura());
    }
}
