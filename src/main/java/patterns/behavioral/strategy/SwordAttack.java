package patterns.behavioral.strategy;

import java.util.Random;

class SwordAttack implements AttackStrategy {

    private final int damage = 40 + new Random().nextInt(31);

    @Override
    public String attack() {
        return "Swings a sword fiercely!";
    }

    @Override
    public int getDPS() {
        return damage;
    }
}