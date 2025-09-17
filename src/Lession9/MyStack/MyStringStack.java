package Lession9.MyStack;

import java.util.Arrays;

public class MyStringStack {
    private String[] stack;
    private int size;
    private static final int CAPACITY = 5;

    public MyStringStack() {

        stack = new String[CAPACITY];
    }

    public void push(String element) {
        if (element == null) return;
        if (size == stack.length) resize();
        stack[size++] = element;
    }

    public String pop() {
        if (size == 0) return null;
        String removed = stack[--size];
        stack[size] = null;
        return removed;
    }

    public String peek() {
        if (size == 0) return null;
        return stack[size - 1];
    }

    public int size() {
        return size;

    }

    public boolean isEmpty() {
        return size == 0;
    }


    @Override
    public String toString() {
        if (size == 0) return "[]";
        StringBuilder builder = new StringBuilder("[ ");
        for (int i = 0; i < size - 1; i++) {
            builder.append(stack[i]).append(", ");
        }
        builder.append(stack[size - 1]);
        builder.append(" ]");
        return builder.toString();
    }

    private void resize() {
        int newLen = stack.length * 2;
        stack = Arrays.copyOf(stack, newLen);
    }

    public static void main(String[] args) {
        MyStringStack stack = new MyStringStack();

        System.out.println("Initial stack: " + stack);

        stack.push("Java");
        System.out.println("After push: " + stack);

        stack.push("PHP");
        stack.push("Python");
        stack.push("C++");
        stack.push("Go");
        stack.push("Rust"); // Should trigger resize
        System.out.println("After multiple pushes: " + stack);

        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("After pop: " + stack);

        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        System.out.println("Empty stack: " + stack);
        System.out.println("Peek on empty: " + stack.peek());
        System.out.println("Pop on empty: " + stack.pop());
    }

}
