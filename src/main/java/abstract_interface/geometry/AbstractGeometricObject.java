package abstract_interface.geometry;

import inheritance.geometry.GeometricObject;

public abstract class AbstractGeometricObject extends GeometricObject {
	public AbstractGeometricObject() {
	}

	public AbstractGeometricObject(String color, boolean filled) {
		super(color, filled);
	}

	/** Abstract method getArea */
	public abstract double getArea();

	/** Abstract method getPerimeter */
	protected abstract double getPerimeter();
}
