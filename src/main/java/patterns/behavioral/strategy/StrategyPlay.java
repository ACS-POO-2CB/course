package patterns.behavioral.strategy;

// Battle Simulation
public class StrategyPlay {
    public static void main(String[] args) {
        GameCharacter knight = new GameCharacter("Knight", new SwordAttack());
        GameCharacter wizard = new GameCharacter("Wizard", new MagicAttack());
        GameCharacter archer = new GameCharacter("Archer", new BowAndArrowAttack());

        // Simulate attack and record DPS
        int knightDPS = knight.performAttack();
        int wizardDPS = wizard.performAttack();
        int archerDPS = archer.performAttack();

        // Determine the winner
        GameCharacter winner = knight;
        int highestDPS = knightDPS;

        if (wizardDPS > highestDPS) {
            winner = wizard;
            highestDPS = wizardDPS;
        }
        if (archerDPS > highestDPS) {
            winner = archer;
            highestDPS = archerDPS;
        }

        System.out.println("The winner is " + winner.getName() + " with a DPS of " + highestDPS + "!");
    }
}

