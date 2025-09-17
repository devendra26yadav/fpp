package Practice.List.LinkedList;

class Log{
    String desc;

    static void desc(String des,int data){
        System.out.println(des+" "+data);
    }
}

class Node{
    int data;
    Node next;
    Node(){}
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LinkedList{
    private  Node head;
    private Node last;

    void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            last=head;
        }
        last.next=newNode;
        last=newNode;
        Log.desc("Added...",data);
    }
    void print(){
        if(head==null){
            System.out.println("Empty List");
        }
        Node curr = head;
        System.out.println("List : ");
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();
    }
}

public class Example1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.print();
        list.add(2);
        list.add(8);
        list.add(-4);
        list.print();
    }
}
