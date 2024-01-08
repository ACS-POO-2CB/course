package patterns.behavioral.visitor;

import patterns.behavioral.visitor.model.Circle;
import patterns.behavioral.visitor.model.Rectangle;
import patterns.behavioral.visitor.model.Square;

public class PerimeterVisitor implements ShapeVisitor {

    private double total;

    @Override
    public void visit(Square square) {
        total += 4 * square.getEdge();
    }

    @Override
    public void visit(Circle circle) {
        total += 2 * Math.PI * circle.getRadius();
    }

    @Override
    public void visit(Rectangle rectangle) {
        total += (rectangle.getWidth() + rectangle.getHeight()) * 2;
    }

    public double getTotal() {
        return total;
    }
}
