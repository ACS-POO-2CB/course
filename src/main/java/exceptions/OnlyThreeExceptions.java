package exceptions;

//Enum class with 3 doom options
enum Options {
    DivisionByZero, IndexOutOfAnyBounds, NullPointer, ;

    //override toString() method
    @Override
    public String toString() {
        switch (this) {
            case DivisionByZero:
                return "Division by zero";
            case NullPointer:
                return "Null pointer";
            case IndexOutOfAnyBounds:
                return "Index out of any bounds";
            default:
                return "Unknown";
        }
    }

    //execute method with 3 options
    public static void execute(Options option) {
        switch (option) {
            case DivisionByZero -> {
                int x = 0;
                int y = 1 / x;
            }
            case NullPointer -> {
                String str = null;
                System.out.println(str.length());
            }
            case IndexOutOfAnyBounds -> {
                int[] arr = new int[1];
                arr[1] = 1;
            }
        }
    }
}

public class OnlyThreeExceptions {
    public static void main(String[] args) {
        //execute method with 3 options
        for (Options option : Options.values()) {
            try {
                Options.execute(option);
            } catch (NullPointerException | ArithmeticException ex) {
                System.err.println("Specific exception on " + option + ": " + ex.getMessage());
            } catch (Exception ex) {
                System.err.println("General exception on " + option + ": " + ex.getClass() + " / " + ex.getMessage());
//                throw new RuntimeException(ex);
            }
            finally {
                System.out.println("Execution finishes ...");
            }
        }
    }
}
