package Practice.Final.MyStack;

public class TestMyStackUsingArray {
    public static void main(String[] args) {
        MyStackUsingArray stack = new MyStackUsingArray();
        System.out.println(stack);
        stack.push(4);
        System.out.println(stack);
        stack.push(9);
        System.out.println(stack);
        System.out.println(stack.isEmpty());

        stack.pop(); stack.pop(); stack.pop();
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
//                stack.printStack();

    }
}
