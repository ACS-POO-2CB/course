package generics;

public class WildCardDemo1 <E> {
    E var;

    public static void main(String[] args) {
        GenericStack<Long> intStack = new GenericStack<>();
        intStack.push(1L); // 1 is autoboxed into new Integer(1)
        intStack.push(2L);
        intStack.push(-2L);

        System.out.print("The max number is " + max(intStack));
    }

    /**
     * Find the maximum in a stack of numbers
     */
    public static double max(GenericStack<? extends Number> stack) {
        double max = stack.pop().doubleValue(); // initialize max
        while (!stack.isEmpty()) {
            max=Math.max(max,stack.pop().doubleValue());
        }
        return max;
    }
}
