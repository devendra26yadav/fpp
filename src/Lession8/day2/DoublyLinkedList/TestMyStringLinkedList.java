package Lession8.day2.DoublyLinkedList;

public class TestMyStringLinkedList {

    public static void main(String[] args) {
        MyStringLinkedList list = new MyStringLinkedList();
        list.addFirst("Banana");
        list.addFirst("Apple");
        list.addFirst("Grapes");
        list.addLast("Pineapple");
        System.out.println(list);
        System.out.println(list.contains("Apple "));
        list.removeLast();;
        System.out.println(list);
    }
}
