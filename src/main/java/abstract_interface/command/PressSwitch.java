package abstract_interface.command;

/* The Command interface */
interface Command {
    void execute();
}

/* The Invoker class */
class Switch {
    private static final int MAX_HISTORY_ITEMS = 10;
    // history of commands
    private Command[] history = new Command[MAX_HISTORY_ITEMS];
    private int crtIndex = 0;

    public void storeAndExecute(Command cmd) {
        if (crtIndex > 0 && cmd.equals(this.history[crtIndex - 1])) {
            System.out.println("The same command was executed before");
        } else {
            this.history[crtIndex++] = cmd;
            crtIndex = crtIndex % MAX_HISTORY_ITEMS;
            cmd.execute();
        }
    }

    public void printHistory() {
        System.out.println("Current history:");
        for (int i = crtIndex - 1; i >= 0; i--) {
            System.out.println(this.history[i]);
        }
    }
}

/* The Receiver class */
class Light {
    public void turnOn() {
        System.out.println("The light is on");
    }

    public void turnOff() {
        System.out.println("The light is off");
    }
}

/* The Command for turning on the light - ConcreteCommand #1 */
class FlipUpCommand implements Command {
    private Light theLight;

    public FlipUpCommand(Light light) {
        this.theLight = light;
    }

    public void execute() {
        theLight.turnOn();
    }
}

/* The Command for turning off the light - ConcreteCommand #2 */
class FlipDownCommand implements Command {
    private Light theLight;

    public FlipDownCommand(Light light) {
        this.theLight = light;
    }

    public void execute() {
        theLight.turnOff();
    }
}

/* The test class or client */
public class PressSwitch {
    public static void main(String[] args) {
        String[] commands = {"ON", "OFF", "OFF", "OFF", "ON"};
        Light lamp = new Light();
        Command switchUp = new FlipUpCommand(lamp);
        Command switchDown = new FlipDownCommand(lamp);
        Switch mySwitch = new Switch();

        for (String command : commands) {
            switch (command) {
                case "ON" -> mySwitch.storeAndExecute(switchUp);
                case "OFF" -> mySwitch.storeAndExecute(switchDown);
                default -> System.err.println("Argument \"ON\" or \"OFF\" is required.");
            }
        }

        mySwitch.printHistory();
    }
}