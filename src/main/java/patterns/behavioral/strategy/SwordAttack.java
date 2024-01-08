package patterns.behavioral.strategy;

import java.util.Random;

class SwordAttack implements AttackStrategy {
    @Override
    public String attack() {
        return "Swings a sword fiercely!";
    }

    @Override
    public int getDPS() {
        return 40 + new Random().nextInt(31);
    }
}