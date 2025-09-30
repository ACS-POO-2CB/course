package patterns.behavioral.visitor.model;

import patterns.behavioral.visitor.ShapeVisitor;

public interface Shape {
    void accept(ShapeVisitor visitor);
}
