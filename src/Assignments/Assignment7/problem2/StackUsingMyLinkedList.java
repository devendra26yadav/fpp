package Assignments.Assignment7.problem2;

public class StackUsingMyLinkedList {
    private Node header;
    private int size;
    private Node last;

    public void push(Integer element) {
        if (element == null) return;

        Node newNode = new Node(element);

        if (header == null) {
            header = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
        }
        last = newNode;
        size++;
    }

    public Integer pop() {
        if (size == 0 || last == null) return null;
        Integer value = last.data;
        last = last.previous;
        if (last == null) {
            header = null;
        } else {
            last.next = null;
        }
        size--;
        return value;
    }
    public Integer peek(){
        if(last==null) return null;
        return last.data;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        if (header == null || size == 0) return "[]";
        Node current = header;
        StringBuilder builder = new StringBuilder("[");
        while (current.next != null) {
            builder.append(current.data).append(", ");
            current = current.next;
        }
        builder.append(current.data).append("]");
        return builder.toString();
    }

    static class Node {
        Node previous;
        Integer data;
        Node next;

        Node(Integer data) {
            this.data = data;
        }
    }
}
