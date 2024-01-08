package patterns.structural.adapter;

// Exception class
class UnsupportedAudioFormatException extends Exception {
    public UnsupportedAudioFormatException(String message) {
        super(message);
    }
}
