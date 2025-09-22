package Assignments.Assignment9.Lession12.problem3;

import java.util.EmptyStackException;

public class TestStack {
    public static void main(String[] args) {
        MyStack stack = new MyStack(3);

        System.out.println("Push 10, 20, 30");
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);

        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("After pop, peek: " + stack.peek());
        int element=70;
        System.out.println("Push : "+element);
        stack.push(element);
        System.out.println("Stack: " + stack);

        // Test Stack Overflow
        try {
            System.out.println("\nTrying to push 40 (should cause overflow)");
            stack.push(40);
        } catch (IllegalStateException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // Test Null Push
        try {
            System.out.println("\nTrying to push null (should cause NullPointerException)");
            stack.push(null);
        } catch (NullPointerException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // Empty the stack
        System.out.println("\nPopping remaining elements...");
        stack.pop(); // Pops 70
        stack.pop(); // Pops 20
        stack.pop(); // Pops 10

        // Test Underflow on pop
        try {
            System.out.println("\nTrying to pop from empty stack");
            stack.pop();
        } catch (EmptyStackException e) {
            System.out.println("Caught exception: Cannot pop, stack is empty.");
        }

        // Test Underflow on peek
        try {
            System.out.println("\nTrying to peek from empty stack");
            stack.peek();
        } catch (EmptyStackException e) {
            System.out.println("Caught exception: Cannot peek, stack is empty.");
        }
    }
}
