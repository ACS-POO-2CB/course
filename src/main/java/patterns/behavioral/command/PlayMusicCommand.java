package patterns.behavioral.command;

public class PlayMusicCommand implements Command {
    private SmartHomeSystem system;
    private CommandHistory history;
    private String track;
    private String previousTrack;

    public PlayMusicCommand(SmartHomeSystem system, CommandHistory history, String track) {
        this.system = system;
        this.history = history;
        this.track = track;
    }

    @Override
    public void execute() {
        previousTrack = system.getPlayingTrack();
        system.playMusic(track);
        history.push(this);
    }

    @Override
    public void undo() {
        system.playMusic(previousTrack);
    }
}
