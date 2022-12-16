package generics;

public class  WildCardDemo3{
	public static void main(String[] args) {
		GenericStack<String> stack1 = new GenericStack();
		GenericStack<Object> stack2 = new GenericStack();

		stack2.push("Java");
		stack2.push(2);
		stack1.push("Oracle");
		add(stack1, stack2);
//		add(stack2, stack1);
		WildCardDemo2.print(stack2);
		System.out.println("---------------");
		WildCardDemo2.print(stack1);
	}

	public static <T> void add(GenericStack<T> stack1, GenericStack<? super T> stack2) {
		while (!stack1.isEmpty())
			stack2.push(stack1.pop());
	}
}