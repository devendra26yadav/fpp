package Assignments.Assignment7.problem1;

public class TestArrayQueue {
    public static void main(String[] args) {
        ArrayQueueImpl queue = new ArrayQueueImpl();

        System.out.println("Is queue empty? " + queue.isEmpty());
        System.out.println("Queue size: " + queue.size());
        System.out.println("Peek on empty queue: " + queue.peek());
        System.out.println("Dequeue on empty queue: " + queue.dequeue());


        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println("Queue after enqueue 4 elements: " + queue);
        System.out.println("Is queue empty? " + queue.isEmpty());
        System.out.println("Queue size: " + queue.size());
        System.out.println("Peek: " + queue.peek());


        queue.enqueue(50);
        System.out.println("Queue after enqueue 5th element (resize): " + queue);
        System.out.println("Queue size: " + queue.size());


        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Queue after 2 dequeues: " + queue);
        System.out.println("Queue size: " + queue.size());
        System.out.println("Peek: " + queue.peek());


        queue.enqueue(60);
        queue.enqueue(70);
        queue.enqueue(80);
        queue.enqueue(90);
        queue.enqueue(100);
        System.out.println("Queue after adding more elements: " + queue);
        System.out.println("Queue size: " + queue.size());


        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }
        System.out.println("Queue after emptying: " + queue);
        System.out.println("Is queue empty? " + queue.isEmpty());

       // queue.enqueue(null);// We commented because  Exception will be generated as of our logic
    }
}
