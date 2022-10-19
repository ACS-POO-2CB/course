package basic_objects;

public class StackOfIntegers {
	private int[] elements;
	private int size;

	public StackOfIntegers() {
		this(256);
	}

	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
	}

	public boolean empty() {
		return (size == 0);
	}

	public int peek() {
		return (size > 0) ? elements[size - 1] : -1;
	}

	public int push(int value) {
		return (size < elements.length) ? (elements[size++] = value) : -1;
	}

	public int pop() {
		return (size >= 1) ? elements[--size] : -1;
	}

	public int getSize() {
		return size;
	}

	public static void main(String[] args) {
		StackOfIntegers stack = new StackOfIntegers(3);
		System.out.println(stack.push(1));
		System.out.println(stack.push(2));
		System.out.println(stack.pop());
		System.out.println(stack.push(4));
	}
}
