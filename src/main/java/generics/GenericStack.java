package generics;

import java.util.Arrays;
import java.util.List;

public class GenericStack<E> {
    private List<E> list = new java.util.ArrayList<>();

    public int getSize() {
        return list.size();
    }

    public E peek() {
        return list.get(getSize() - 1);
    }

    public <T extends E, Z> void push(T object) {
        list.add(object);
    }

    public E pop() {
        E o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public static <E> void print(E[] list) {
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        GenericStack<String> stack1 = new GenericStack();
        String[] strings = {"Seria", "CB"};
        Integer numar = 2;
        for (String s : strings)
            stack1.push(s);
        stack1.push(numar.toString());
        print(stack1.list.toArray(new String[stack1.getSize()]));

        GenericStack<Integer> stack2 = new GenericStack();

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        for (Integer i : integers)
            stack2.push(i);
        while (!stack2.isEmpty())
            System.out.print(stack2.pop() + " ");
        System.out.println();
    }
}