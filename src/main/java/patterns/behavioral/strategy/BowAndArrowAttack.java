package patterns.behavioral.strategy;


import java.util.Random;

public class BowAndArrowAttack implements AttackStrategy {
    @Override
    public String attack() {
        return "Shoots an arrow with precision!";
    }

    @Override
    public int getDPS() {
        return 30 + new Random().nextInt(41);
    }
}
