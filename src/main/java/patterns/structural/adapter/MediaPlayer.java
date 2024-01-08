package patterns.structural.adapter;

// Media player interfaces and implementations
interface MediaPlayer {
    void play(String audioType, String fileName) throws UnsupportedAudioFormatException;
}
