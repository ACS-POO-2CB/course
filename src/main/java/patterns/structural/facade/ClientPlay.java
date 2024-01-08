package patterns.structural.facade;

public class ClientPlay {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.start(); // Starting the computer...
    }

}
