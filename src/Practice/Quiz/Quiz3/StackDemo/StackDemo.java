package Practice.Quiz.Quiz3.StackDemo;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        System.out.println(stack.pop());  // ?
        stack.push("C");
        System.out.println(stack.peek());
    }
}
