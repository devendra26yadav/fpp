package Practice.Final.MyArrayList;

import java.util.Arrays;

public class CustomArrayList {
    public static int resizeCount;
    private static final int MY_CAPACITY = 3;
    private String[] arr;
    private int size;

    public CustomArrayList() {
        this(MY_CAPACITY);
    }

    public CustomArrayList(int capacity) {
        if (capacity < 0) throw new IllegalArgumentException("");
        arr = new String[capacity];
        size = 0;
    }

    public void add(String element) {
        if (element == null) return;
        if (size == arr.length) resize();
        arr[size++] = element;
    }

    public void insert(int position, String element) {
        if (position < 0 || position > size || element == null) {
            return;
        }
        if (size == arr.length) resize();
        for (int i = size; i > position; i--) {
            arr[i] = arr[i - 1];
        }
        arr[position] = element;
        size++;
    }

    public String remove(int position) {
        if (position < 0 || position > size - 1) return null;
        String val = arr[position];
        for (int i = position; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[--size] = null;
        return val;
    }
    public boolean contains(String element){
        if (element==null) return false;
        return indexOf(element)!=-1;
    }
    public int indexOf(String element){
        if(element==null) return -1;
        for(int i=0;i<size;i++){
            if(arr[i].equals(element)) return i;
        }
        return -1;
    }

    public void printArray() {
        System.out.println("Array : ");
        System.out.println(Arrays.toString(arr));
    }

    public void clear() {
        Arrays.fill(arr, 0, size, null);
        size=0;
    }

    public String get(int index) {
        if (index < 0 || index > size - 1) return null;
        return arr[index];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void resize() {
        if (size == arr.length) {
            int newLength = 2 * arr.length;
            arr = Arrays.copyOf(arr, newLength);
            resizeCount++;
            System.out.println("resizing " + resizeCount + " times");
        }

    }

    @Override
    public String toString() {
        if (size == 0) return "[]";
        if (size == 1) return "[" + arr[0] + "]";
        StringBuilder builder = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++) {
            builder.append(arr[i]).append(", ");
        }
        builder.append(arr[size - 1]).append("]");
        return builder.toString();
    }
}
