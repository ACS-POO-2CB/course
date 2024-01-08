package patterns.behavioral.strategy;

// Context: Game Character
public class GameCharacter {
    private AttackStrategy attackStrategy;
    private String name;

    public GameCharacter(String name, AttackStrategy attackStrategy) {
        this.name = name;
        this.attackStrategy = attackStrategy;
    }

    public String getName() {
        return name;
    }

    public int performAttack() {
        int dps = attackStrategy.getDPS();
        System.out.println(name + " " + attackStrategy.attack() + " (DPS: " + dps + ")");
        return dps;
    }
}
