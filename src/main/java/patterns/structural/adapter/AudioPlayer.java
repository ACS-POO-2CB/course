package patterns.structural.adapter;

// AudioPlayer implementing MediaPlayer
class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    public void play(String fileType, String fileName) {
        // Inbuilt support to play mp3 music files
        if (fileType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
        // MediaAdapter is providing support to play other file formats
        else {
            try {
                mediaAdapter = new MediaAdapter(fileType);
                mediaAdapter.play(fileType, fileName);
            } catch (UnsupportedAudioFormatException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
