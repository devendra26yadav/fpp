package Lession8.day2.DoublyLinkedList;

public class MyStringLinkedList {
    private Node header;

    public MyStringLinkedList(){
        // start engine dummy node as header , no data
        header=new Node(null);
    }

    // list behaviors
    public void addFirst(String data){
        if(data==null) return;
        Node newNode = new Node(data);
        newNode.previous=header;
        newNode.next=header.next; // will work if null or existing connection
        // if the list has more than one element
        if(header.next!=null){
            header.next.previous=newNode;
        }
        header.next=newNode;
    }
    public void addLast(String data){
        // create a node
        Node newNode = new Node(data);
        Node last = header.next; // starting point

        //finding the last node
        while (last.next!=null){
            last=last.next;
        }
        //insert the new node at last
        last.next = newNode;
        newNode.previous=last;


    }
    public boolean contains(String element){
        if(header.next==null) return false;
        Node current = header.next;
        while (current!=null && !current.data.equals(element)) current=current.next;
        return current != null;
    }
    public void removeLast(){
        if(header.next==null) return;
        Node last = header.next;

        if(last.next==null){
            header.next=null; return;
        }
        while(last.next!=null) last=last.next;

        last.previous.next=null;
        last=null;
    }
    public void print(){
        if(header.next==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node current=header.next;
        while(current!=null){
            System.out.print(current +" ");
            current=current.next;
        }
    }
    @Override
    public String toString(){
        if(header.next==null) return "null";
        StringBuilder sb = new StringBuilder("[");
        Node current = header.next;
        while (current!=null){
            sb.append(current.data).append("->");
            current=current.next;
        }
        sb.append("null");
        sb.append("]");
        return sb.toString();
    }
    //inner class node structure
    class Node{
        String data;
        Node previous;
        Node next;
        Node(String data){
            this.data = data;
        }
        @Override
        public String toString(){
            return data==null?"null":data;
        }
    }
}
