package patterns.behavioral.command;

public class SmartHomeSystem {
    private int temperature;
    private String playingTrack;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void playMusic(String track) {
        playingTrack = track;
    }

    public String getPlayingTrack() {
        return playingTrack;
    }
}
