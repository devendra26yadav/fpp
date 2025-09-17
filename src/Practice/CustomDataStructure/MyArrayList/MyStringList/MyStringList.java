package Practice.CustomDataStructure.MyArrayList.MyStringList;

import java.util.Arrays;

public class MyStringList {
    private String[] arr;
    private int size;
    private final int CAPACITY = 8;

    public MyStringList() {
        this.arr = new String[CAPACITY];
    }

    public MyStringList(int size) {
        this.arr = new String[size];
    }

    public void add(String data) {
        if (data == null) return;
        if (size == arr.length) {
            resize();
        }
        arr[size++] = data;
    }

    public int indexOf(String data) {
        if (data == null || size == 0) return -1;
        for (int i = 0; i < size; i++) {
            if (data.equals(arr[i])) {
                return i;
            }
        }
        return -1;
    }

    public String removeAt(int index) {
        if (index < 0 || index >= size) return null;
        String result = arr[index];
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = null;
        size--;
        return result;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            arr[i] = null;
        }
        size = 0;
    }

    public String set(int index, String element) {
        if (index < 0 || index >= size || element==null) return null;
        String removedElement = arr[index];
        arr[index] = element;
        return removedElement;
    }

    public boolean containsAll(MyStringList sublist) {
        if (sublist == null || sublist.size == 0) return false;
        for (int i = 0; i < sublist.size; i++) {
            if (indexOf(sublist.arr[i]) == -1) return false;
        }
        return true;
    }

    public MyStringList subList(int start, int end) {
        if (start < 0 || end > size || start >= end) return new MyStringList(0);
        MyStringList result = new MyStringList(end - start);
        for (int i = start; i < end; i++) {
            result.add(arr[i]);
        }
        return result;
    }

    public String get(int index) {
        if (index < 0 || index >= size) return null;
        return arr[index];
    }

    public boolean find(String element) {
        if (element == null || size == 0) return false;
        for (int i = 0; i < size; i++) {
            if (element.equals(arr[i])) {
                return true;
            }
        }
        return false;
    }
    public void insert(String element,int position){
        if( element==null || position>size || position<0) return;
        if(size==arr.length) resize();
        for (int i=size;i>position;i--){
            arr[i]=arr[i-1];
        }
        arr[position]=element;
        size++;
    }
    public boolean remove(String element){
        if(element==null || size==0) return false;
        int position = indexOf(element);
        if(position==-1) return false;
        for(int i=position;i<size-1;i++){
            arr[i]=arr[i+1];
        }
        arr[size-1]=null;
        size--;
        return true;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size==0;
    }
    private void resize() {
        int currentSize = arr.length;
        arr = Arrays.copyOf(arr, currentSize * 2);
    }

    @Override
    public String toString() {
        if (size == 0) return "[]";
        StringBuilder str = new StringBuilder("[");
        for (int i = 0; i < size - 1; i++) {
            str.append(arr[i]).append(", ");
        }
        str.append(arr[size - 1]);
        str.append("]");
        return str.toString();
    }
}
