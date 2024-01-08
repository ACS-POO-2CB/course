package patterns.behavioral.command;

public class CommandPlay {
    public static void main(String[] args) {
        SmartHomeSystem system = new SmartHomeSystem();
        CommandHistory history = new CommandHistory();

        SetTemperatureCommand setTemperature = new SetTemperatureCommand(system, history, 22);
        setTemperature.execute();

        PlayMusicCommand playMusic = new PlayMusicCommand(system, history, "Chill vibes");
        playMusic.execute();

        playMusic = new PlayMusicCommand(system, history, "Hard rock");
        playMusic.execute();

        System.out.println("Temperature set to: " + system.getTemperature());
        System.out.println("Music playing: " + system.getPlayingTrack());

        // Undo last command
        if (!history.isEmpty()) {
            Command lastCommand = history.pop();
            lastCommand.undo();
        }

        System.out.println("Temperature after undo: " + system.getTemperature());
        System.out.println("Music after undo: " + system.getPlayingTrack());
    }
}
