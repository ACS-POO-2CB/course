package patterns.structural.adapter;

// Adapter class
class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) throws UnsupportedAudioFormatException {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer = new Mp4Player();
        } else {
            throw new UnsupportedAudioFormatException("Invalid media. " + audioType + " format not supported");
        }
    }

    public void play(String audioType, String fileName) throws UnsupportedAudioFormatException {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer.playMp4(fileName);
        } else {
            throw new UnsupportedAudioFormatException("Invalid media. " + audioType + " format not supported");
        }
    }
}
