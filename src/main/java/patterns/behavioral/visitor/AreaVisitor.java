package patterns.behavioral.visitor;

import patterns.behavioral.visitor.model.Circle;
import patterns.behavioral.visitor.model.Rectangle;
import patterns.behavioral.visitor.model.Square;

public class AreaVisitor implements ShapeVisitor {
   private double total;

   @Override
   public void visit(Square square) {
      total +=Math.pow(square.getEdge(), 2);
   }

   @Override
   public void visit(Circle circle) {
      total += Math.PI * Math.pow(circle.getRadius(), 2) ;
   }

   @Override
   public void visit(Rectangle rectangle) {
      total += rectangle.getWidth() * rectangle.getHeight();
   }

   public double getTotal() {
      return total;
   }
}
