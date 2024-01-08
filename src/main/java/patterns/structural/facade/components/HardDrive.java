package patterns.structural.facade.components;

public class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("Reading data from hard drive at " + lba);
        return new byte[size];
    }
}
