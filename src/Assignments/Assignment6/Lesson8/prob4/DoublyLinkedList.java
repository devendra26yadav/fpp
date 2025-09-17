package Assignments.Assignment6.Lesson8.prob4;


public class DoublyLinkedList {
    private Node header;
    private Node last;

    public void addLast(String element) {
        Node newNode = new Node(element);
        if (header == null) {
            header = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
        }
        last = newNode;

    }
    public boolean remove(String element){
        if (element == null) return false;

        Node current = header;
        while (current != null && !current.data.equals(element)) {
            current = current.next;
        }

        if (current == null) return false;


        if (current == header) {
            header = current.next;
            if (header != null) {
                header.previous = null;
            } else {
                last = null;
            }
        }

        else if (current == last) {
            last = current.previous;
            if (last != null) {
                last.next = null;
            }
        }

        else {
            current.previous.next = current.next;
            current.next.previous = current.previous;
        }

        return true;
    }
    // removing first
    public boolean removeFirst(){
        if(header==null) return false;
        if(header==last){
            header=null;
            last=null;
        }
        else{
            header=header.next;
            header.previous=null;
        }
        return true;
    }
    public void addFirst(String element){
        Node node = new Node(element);
        if(header==null){
            header=node;
            last=node;
        }else{
            node.next=header;
            header.previous=node;
            header=node;
        }
    }

    public void print() {
        if (header == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.print("Forward Direction : ");
        Node current = header;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public void printReverse(){
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }
        System.out.print("\nReverse order : ");
        Node curr = last;
        while (curr!=null){
            System.out.print(curr.data+" -> ");
            curr=curr.previous;
        }
        System.out.print("null");
        System.out.println();
    }
    static class Node {
        String data;
        Node next;
        Node previous;

        public Node(String data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }


    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Java");
        list.addLast("HPP");
        list.addLast("Python");
        list.print();
        list.printReverse();
        list.addFirst("C++");
        list.print();
        list.printReverse();
        list.remove("HPP");
        list.print();
        list.remove("Python");
        list.removeFirst();
        list.print();
    }
}
