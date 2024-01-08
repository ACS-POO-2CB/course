package patterns.structural.decorator;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DecoratorPlay {

   public static void main(String[] args) throws IOException {
      BasicMath math = new BasicMathDecoratorWithLog(new BasicMathImpl());
//      BasicMath matematica =  new BasicMathImpl() ;

//      Writer writer = new BufferedWriter(new FileWriter("a.txt")); // decorator from JDK
//      Writer writer = new FileWriter("a.txt");

      System.out.println(math.sum(1, 2));
      System.out.println(math.sum(1, 3));
      System.out.println(math.product(2, 3));
   }

   static class BasicMathDecoratorWithLog implements BasicMath {
      private final BasicMath delegate;
      private static final Logger log = Logger.getLogger(BasicMathDecoratorWithLog.class.getName());

      BasicMathDecoratorWithLog(BasicMath delegate) {
         this.delegate = delegate;
      }

      @Override
      public int sum(int a, int b) {
         log.log(Level.INFO,"Adding " + a + " with " + b);
         return delegate.sum(a, b);
      }

      @Override
      public int product(int a, int b) {
         log.log(Level.INFO,"Multiplying " + a + " with " + b);
         return delegate.product(a, b);
      }
   }

   public static class BasicMathImpl implements BasicMath {
      @Override
      public int sum(int a, int b) {
         return a + b;
      }

      @Override
      public int product(int a, int b) {
         return a * b;
      }
   }

   public interface BasicMath {
      int sum(int a, int b);

      int product(int a, int b);
   }
}

