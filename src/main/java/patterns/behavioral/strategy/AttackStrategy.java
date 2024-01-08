package patterns.behavioral.strategy;

import java.util.Random;

// Strategy Interface for Attack
public interface AttackStrategy {
    String attack();

    int getDPS(); // DPS (Damage Per Second)
}
