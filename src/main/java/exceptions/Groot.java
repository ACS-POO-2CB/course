package exceptions;

class OriginalGroot {
    public OriginalGroot() {
        System.out.println("I am Groot");
    }

    public void run() throws ClassNotFoundException {
        System.out.println("I am lost without Groot");
    }
}

class SubGroot extends OriginalGroot {
    public SubGroot() {
        System.out.println("Extends OriginalGroot");
    }

    @Override
    // Exception
    public void run() throws ArithmeticException, NullPointerException, RuntimeException {
        System.out.println("I am Groot. Everything is fine");
        throw new NullPointerException("I AM GROOT!");
    }
}

public class Groot {
    public static void main(String[] args) throws Exception {
        SubGroot subGroot = new SubGroot();
        try {
            subGroot.run();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
            throw new Exception(e);
        }
    }
}
