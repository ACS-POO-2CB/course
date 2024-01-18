package patterns.behavioral.visitor;

import patterns.behavioral.visitor.model.Circle;
import patterns.behavioral.visitor.model.Rectangle;
import patterns.behavioral.visitor.model.Square;

public interface ShapeVisitor {
	void visit(Square square);

	void visit(Circle circle);

	void visit(Rectangle rectangle);

	public double getTotal();
}
