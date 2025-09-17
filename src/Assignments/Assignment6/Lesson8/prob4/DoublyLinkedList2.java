package Assignments.Assignment6.Lesson8.prob4;

public class DoublyLinkedList2 {
    private Node header;
    DoublyLinkedList2(){
        header=new Node(null);
    }
    public void addLast(String element){
        Node newNode = new Node(element);
        if(header.next==null){
            header.next=newNode;
        }else{
            Node lastNode = header.next;
            while(lastNode.next!=null)lastNode=lastNode.next;
            lastNode.next=newNode;
            newNode.previous=lastNode;
        }
    }
    public boolean remove(String element){
        if(element==null) return false;
        Node current = header.next;
        while(current!=null && !current.data.equals(element)) current=current.next;

        if(current==null) return false;

        //  if first node
        if(current==header.next){
            header.next=current.next;
            if(header.next!=null){
                header.next.previous = header;
            }
        }
        // if last node
        else if(current.next==null){
            current.previous.next = null;
        }
        else{
            current.previous.next = current.next;
            current.next.previous = current.previous;
        }
        return true;
    }

    public boolean removeFirst() {
        if (header.next == null) return false;
        header.next = header.next.next;
        if (header.next != null) {
            header.next.previous = header;
        }
        return true;
    }
    public void printReverse(){
        if(header.next==null) {
            System.out.println("Empty");
            return;
        }
        Node last =header.next;
        while(last.next!=null) last=last.next;
        StringBuilder ts = new StringBuilder("[ ");
        while(last!=null){
            ts.append(last.data).append("->");
            last=last.previous;
        }
        ts.append("null").append(" ]");
        System.out.println(ts);
    }
    @Override
    public String toString(){
        if(header.next==null) return null;
        StringBuilder sb = new StringBuilder("[ ");
        Node current=header.next;
        while (current!=null){
            sb.append(current.data).append("->");
            current=current.next;
        }
        sb.append("null").append(" ]");
        return sb.toString();
    }
    class Node {
        Node previous;
        String data;
        Node next;
        Node (String data){
            this.data=data;
        }
        @Override
        public String toString(){
            return data;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList2 dll = new DoublyLinkedList2();
        dll.addLast("Max");
        dll.addLast("Jack");
        dll.addLast("Kyle");
        System.out.println(dll);
        System.out.println("Printing In Reverse Order ");
        dll.printReverse();
        System.out.println("removeFirst() : "+dll.removeFirst());
        System.out.println(dll);
        System.out.println("remove(\"Kyle\") : "+dll.remove("Kyle"));
        System.out.println(dll);
        dll.remove("Jack");
        System.out.println(dll);
        dll.printReverse();

    }
}
/*
Sample Output:

[ Max->Jack->Kyle->null ]
Printing In Reverse Order
[ Kyle->Jack->Max->null ]
removeFirst() : true
[ Jack->Kyle->null ]
remove("Kyle") : true
[ Jack->null ]
null
Empty
 */