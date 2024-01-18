package patterns.behavioral.strategy;


import java.util.Random;

public class BowAndArrowAttack implements AttackStrategy {
    private final int damage = 30 + new Random().nextInt(41);

    @Override
    public String attack() {
        return "Shoots an arrow with precision!";
    }

    @Override
    public int getDPS() {
        return damage;
    }
}
