package generics;

import java.util.ArrayList;
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

    public void push(E object) {
        list.add(object);
    }

    public E pop() {
        E o = list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public List<E> getList() {
        return list;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public static <E> void print(List<E> list) {
        for (E e : list)
            System.out.print(e + " ");
        System.out.println();
    }

    public static <E extends Number> void printNumbers(List<E> list) {
        for (E e : list)
            System.out.print(e.doubleValue() + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        GenericStack<String> stack1 = new GenericStack();
        String[] strings = {"Seria", "CB"};
        Integer no = 2;
        for (String s : strings)
            stack1.push(s);
        stack1.push(no.toString());
        print(stack1.getList());
//        printNumbers(stack1.getList());

        GenericStack<Integer> stack2 = new GenericStack();

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
        for (Integer i : integers)
            stack2.push(i);
        printNumbers(stack2.getList());
    }
}