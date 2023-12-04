package exceptions;

class Exception1 extends Exception {
}
class Exception2 extends Exception {
}

class Exception21 extends Exception2 {
}

public class Rethrowing {
    public static void main(String[] args) throws Exception1, Exception2 {
        int x = 1, y = 0;
        try {
            if (x > y)
                throw new Exception1();
            else
                throw new Exception21();
//            throw new Exception2();
        }catch (Exception21 e) {
            System.out.println("Caught " + e);
        }
        catch (Exception2 | Exception1 e) {
            System.out.println("Caught " + e);
            throw e;
        }
        catch (Exception e) {
            System.out.println("Ooo no " + e);
        }
    }
}
