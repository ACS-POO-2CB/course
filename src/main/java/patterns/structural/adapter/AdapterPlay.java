package patterns.structural.adapter;

// Demo class
public class AdapterPlay {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "audio.mp3");
        audioPlayer.play("mp4", "video.mp4");
        audioPlayer.play("vlc", "strange_format.vlc");
        audioPlayer.play("avi", "nothing.avi"); // Unsupported format
    }
}
