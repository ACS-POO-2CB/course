package patterns.behavioral.command;

public class SetTemperatureCommand implements Command {
    private SmartHomeSystem system;
    private CommandHistory history;
    private int temperature;
    private int previousTemperature;

    public SetTemperatureCommand(SmartHomeSystem system, CommandHistory history, int temperature) {
        this.system = system;
        this.history = history;
        this.temperature = temperature;
    }

    @Override
    public void execute() {
        previousTemperature = system.getTemperature();
        system.setTemperature(temperature);
        history.push(this);
    }

    @Override
    public void undo() {
        system.setTemperature(previousTemperature);
    }
}
