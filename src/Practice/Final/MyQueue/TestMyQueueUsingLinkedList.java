package Practice.Final.MyQueue;

public class TestMyQueueUsingLinkedList {
    public static void main(String[] args) {
        MyQueueUsingLinkedList queue = new MyQueueUsingLinkedList();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        System.out.println(queue);         // [A, B, C]
        System.out.println(queue.poll());  // A
        System.out.println(queue.peek());  // B
        System.out.println(queue);         // [B, C]
        System.out.println(queue.size());  // 2
        System.out.println(queue.isEmpty()); // false
        queue.poll();
        queue.poll();
        System.out.println(queue.poll());  // null
        System.out.println(queue);         // []
    }
}
