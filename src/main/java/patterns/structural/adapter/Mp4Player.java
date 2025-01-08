package patterns.structural.adapter;

class Mp4Player implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        // Do nothing
    }

    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file with awesome audio. Name: " + fileName);
    }
}
