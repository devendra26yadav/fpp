package Assignments.Assignment7.problem1;

public class ArrayQueueImpl {
    private final int DEFAULT_CAPACITY = 500;
    private int size;
    private Integer[] arr;
    private int front;
    private int rear;

    // Add Constructors, Default and Parameterized to initialize instance fields
    public ArrayQueueImpl() {
        arr = new Integer[DEFAULT_CAPACITY];
        front = rear = 0;
    }

    public Integer peek() {
        if (size == 0) return null;
        return arr[front];
    }

    //implement
    public void enqueue(Integer obj) { //implement
        if (obj == null) throw new IllegalArgumentException("Null values not allowed");
        if (size == arr.length) resize();
        arr[rear] = obj;
        rear = (rear + 1) % arr.length;
        size++;
    }

    public Integer dequeue() {
        if (size == 0) return null;
        int removed = arr[front];
        arr[front] = null;
        front = (front + 1) % arr.length;
        size--;
        return removed;
    }

    public boolean isEmpty() { //implement
        return size == 0;
    }

    public int size() { //implement
        return size;
    }

    private void resize() {
        int newLength = arr.length * 2;
        Integer[] newArr = new Integer[newLength];
        for (int i = 0; i < size; i++) {
            newArr[i] = arr[(front + i) % arr.length];
        }
        arr = newArr;
        front = 0;
        rear = size;
    }
    @Override
    public String toString() {
/* Return data in this format, each element separated by comma with in [ ] eg:
[10, 20, 30, 40, 50, 60 ]*/
        if (size == 0) return "[]";
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            builder.append(arr[(front + i) % arr.length]);
            if (i < size - 1) builder.append(", ");
        }
        builder.append("]");
        return builder.toString();
    }
}