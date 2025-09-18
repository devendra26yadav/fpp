package Assignments.Assignment7.problem2;

public class TestStack {
    public static void main(String[] args) {
        StackUsingMyLinkedList stack= new StackUsingMyLinkedList();
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.size());

        System.out.println("pop : "+stack.pop());
        System.out.println(stack);
        System.out.println("Peek  :"+stack.peek());

        while (!stack.isEmpty()) {
            System.out.println("Poped : "+stack.pop());
        }

        System.out.println("stack.isEmpty() : "+stack.isEmpty());
        System.out.println(stack.peek());

    }
}
/*
Sample Output:
true
null
[10, 20, 30]
30
3
pop : 30
[10, 20]
Peek  :20
Poped : 20
Poped : 10
stack.isEmpty() : true
null


 */