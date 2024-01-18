package patterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Battle Simulation
public class StrategyPlay {
    public static void main(String[] args) {
        List<GameCharacter> characterList = Arrays.asList(new GameCharacter("Knight", new SwordAttack()),
                new GameCharacter("Wizard", new MagicAttack()),
                new GameCharacter("Archer", new BowAndArrowAttack()));

        double maxDPS = 0;
        GameCharacter winner = null;
        for (GameCharacter character : characterList) {
            int damage = character.performAttack();
            if (damage > maxDPS) {
                maxDPS = damage;
                winner = character;
            }
        }

        System.out.println("The winner is " + winner.getName() + " with a DPS of " + maxDPS + "!");
    }
}

