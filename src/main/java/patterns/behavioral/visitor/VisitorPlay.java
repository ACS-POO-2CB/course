package patterns.behavioral.visitor;

import patterns.behavioral.visitor.model.*;
import java.util.Arrays;
import java.util.List;

public class VisitorPlay {

	public static void main(String[] args) {
		for (ShapeVisitor visitor: Arrays.asList(new PerimeterVisitor(), new AreaVisitor())) {
			for (Shape shape : Arrays.asList(
					new Square(10),
					new Circle(5),
					new Square(5))) {
				shape.accept(visitor);
			}
			System.out.println("Total: " + visitor.getTotal());
		}
	}
}
