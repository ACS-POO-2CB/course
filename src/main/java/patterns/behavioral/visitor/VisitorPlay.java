package patterns.behavioral.visitor;

import patterns.behavioral.visitor.model.*;
import java.util.Arrays;
import java.util.List;

public class VisitorPlay {

	public static void main(String[] args) {
		List<Shape> shapes = Arrays.asList(
			new Square(10),
			new Circle(5),
			new Square(5));

		PerimeterVisitor perimeterVisitor = new PerimeterVisitor();
		for (Shape shape : shapes) {
			shape.accept(perimeterVisitor);
		}
		System.out.println("Total perimeter: " + perimeterVisitor.getTotal());

		AreaVisitor areaVisitor = new AreaVisitor();
		for (Shape shape : shapes) {
			shape.accept(areaVisitor);
		}

		System.out.println("Total area: " + areaVisitor.getTotal());
	}
}
