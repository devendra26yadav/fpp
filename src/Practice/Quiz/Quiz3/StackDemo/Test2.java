package Practice.Quiz.Quiz3.StackDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Test2 {
    public static void main(String[] args) {
//        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(20);
//        System.out.println(stack);
//        stack.pop();
//        System.out.println(stack);
//        System.out.println(stack.peek());
//        System.out.println(stack.isEmpty());
//        System.out.println(stack.size());
//        System.out.println(stack.search(10));
//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }
        List<Integer> list = new ArrayList<>(Arrays.asList(10,20,30));
        list.add(40);
        System.out.println(list);
        List<String> list2 = Arrays.asList("A", "B");
        list2.add("C");
        System.out.println(list2);

    }
}
