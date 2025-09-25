package Practice.Final.MyQueue;


public class MyQueueUsingLinkedList {
    private Node front, last;
    private int size = 0;

    private static class Node {
        Node previous;
        String data;
        Node next;

        private Node(String data) {
            this.data = data;
        }
    }

    public void offer(String element) {
        if (element == null) return;
        Node newNode = new Node(element);
        if (isEmpty()) {
            front = last = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
            last = newNode;
        }

        size++;
    }

    public String poll() {
        if (isEmpty()) return null;
        String val = front.data;
        front = front.next;
        if (front != null) {
            front.previous = null;
        } else {
            last = null;
        }
        size--;
        return val;
    }

    public String peek() {
        if (isEmpty()) return null;
        return front.data;
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
        StringBuilder builder = new StringBuilder("[");
        Node current = front;
        while (current.next != null) {
            builder.append(current.data).append(", ");
            current = current.next;
        }
        builder.append(current.data).append("]");
        return builder.toString();
    }
}
