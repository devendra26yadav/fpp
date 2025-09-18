package Lession10.BinarySearchTree;

public class BST {
    private Node root;

    static class Node{
        Node left;
        Integer data;
        Node right;
        private Node(Integer data){
            this.data=data;
        }
    }
//    public void insert(Integer data){
//        if(root==null){
//            root=new Node(data);
//        }
//        else if(data.compareTo(root.data)<0){
//            insert(root.left);;
//        }
//    }

}
