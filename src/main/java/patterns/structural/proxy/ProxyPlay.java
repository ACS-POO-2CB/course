package patterns.structural.proxy;

import patterns.structural.decorator.DecoratorPlay;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyPlay {

   private static void importantClientCode(DecoratorPlay.BasicMath m) {
      System.out.println(m.sum(1, 1));
      System.out.println(m.sum(2, 0));
      System.out.println(m.sum(3, -1));
      System.out.println(m.product(2, 1));
      System.out.println(m.product(2, 2));
   }

   public static void main(String[] args) {

      DecoratorPlay.BasicMath impl = new DecoratorPlay.BasicMathImpl();

      InvocationHandler handler = new InvocationHandler() {
         @Override
         public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("Processing " + method.getName() + " with params " + Arrays.toString(args));
            return method.invoke(impl, args); // TODO never forget to call real method
         }
      };

      DecoratorPlay.BasicMath mathProxy = (DecoratorPlay.BasicMath) Proxy.newProxyInstance(
              ProxyPlay.class.getClassLoader(),
              new Class<?>[]{DecoratorPlay.BasicMath.class},
              handler
      );

      importantClientCode(mathProxy);
   }
}

