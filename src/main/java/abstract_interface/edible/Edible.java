package abstract_interface.edible;

public interface Edible {
	/** Describe how to eat */
    String howToEat();

	default void print() {
		System.out.println(getClassName()+": I am an edible object");
	}

	private String getClassName() {
		return this.getClass().getName();
	}

	static String getClassNameStatic() {
		return "Edible printed nicely";
	}
}