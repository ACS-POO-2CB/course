package abstract_interface.geometry;

import inheritance.geometry.GeometricObject;

import java.awt.*;

public abstract class AbstractGeometricObject extends GeometricObject {

    public AbstractGeometricObject() {
		super(Color.MAGENTA.toString(),true);
	}

	public AbstractGeometricObject(String color, boolean filled) {
		super(color, filled);
	}

	/** Abstract method getArea */
	public abstract double getArea();

	/** Abstract method getPerimeter */
	public abstract double getPerimeter();

	@Override
	public abstract String toString() ;
}
