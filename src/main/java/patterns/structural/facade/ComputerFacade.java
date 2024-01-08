package patterns.structural.facade;

import patterns.structural.facade.components.CPU;
import patterns.structural.facade.components.HardDrive;
import patterns.structural.facade.components.Memory;

class ComputerFacade {
    private CPU processor;
    private Memory ram;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.processor = new CPU();
        this.ram = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        processor.freeze();
        ram.load(BOOT_ADDRESS, hardDrive.read(BOOT_SECTOR, SECTOR_SIZE));
        processor.jump(BOOT_ADDRESS);
        processor.execute();
    }

    private static final long BOOT_ADDRESS = 0x00000000;
    private static final long BOOT_SECTOR = 0x00000000;
    private static final int SECTOR_SIZE = 1024;
}
