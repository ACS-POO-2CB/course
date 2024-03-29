package patterns.behavioral.strategy;

import java.util.Random;

// Concrete Strategy 2: Magic Attack
public class MagicAttack implements AttackStrategy {

    private final int damage = 60 + new Random().nextInt(21);

    @Override
    public String attack() {
        return "Casts a powerful spell!";
    }

    @Override
    public int getDPS() {
        return damage;
    }
}
