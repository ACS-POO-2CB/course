package patterns.structural.facade.components;

public class Memory {
    public void load(long position, byte[] data) {
        System.out.println("Loading data into memory at position " + position);
    }
}
