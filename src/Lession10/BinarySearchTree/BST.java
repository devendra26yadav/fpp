package Lession10.BinarySearchTree;

import java.util.Iterator;

public class BST {
    private Node root;
    private int size;

    private static class Node{
        Node left;
        Integer data;
        Node right;
        private Node(Integer data){
            this.data=data;
        }
    }

    public void insert(Integer data){
        root=insertHelper(root,data);
        size++;
    }
    private Node insertHelper(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (data < node.data) {
            node.left = insertHelper(node.left, data);
        } else {
            node.right = insertHelper(node.right, data);
        }

        return node;
    }
    public void preOrder(){
        System.out.print("\nPreorder Traversal : ");
        preOrderHelper(root);

    }
    private void preOrderHelper(Node node){
        if(node==null) return;
        System.out.print(node.data+" ");
        preOrderHelper(node.left);
        preOrderHelper(node.right);
    }
    public void inOrder(){
        System.out.print("\nInorder Traversal : ");
        inOrder(root);
    }
    private void inOrder(Node node){
        if(node==null) return;
        inOrder(node.left);
        System.out.print(node.data+" ");
        inOrder(node.right);
    }
    public void postOrder(){
        System.out.print("\nPost Order traversal : ");
        postOrderHelper(root);
        System.out.println();
    }
    private void postOrderHelper(Node node){
        if(node==null) return;
        postOrderHelper(node.left);
        postOrderHelper(node.right);
        System.out.print(node.data+" ");
    }
    public boolean contains(Integer element){
        System.out.printf("BST contains %d : ",element);
        return containsHelper(root,element);
    }
    private boolean containsHelper(Node node, Integer element){
        if(node==null) return false;
        if(node.data.equals(element)){
            return true;
        }
        return containsHelper(node.left,element) || containsHelper(node.right,element);
    }
    public int countLeafNode(){
        return countLeafNodeHelper(root);
    }
    private  int countLeafNodeHelper(Node node){
        if(node==null) return 0;
        if(node.left==null && node.right==null){
            return 1;
        }
        return countLeafNodeHelper(node.left) + countLeafNodeHelper(node.right);
    }
    public Integer getRoot(){
        if(root==null) return null;
        return root.data;
    }
    public Integer findMin(){
        return findMinHelper(root);
    }
    private Integer findMinHelper(Node node){
        if(node==null) return null;
        if(node.left==null && node.right==null){
            return node.data;
        }
        return findMinHelper(node.left);
    }
    public Integer findMax(){
        return findMaxHelper(root);
    }
    private Integer findMaxHelper(Node node){
        if(node==null) return null;
        if(node.left==null && node.right==null){
            return node.data;
        }
        return findMaxHelper(node.right);
    }
    public void makeBST(Integer[] data){
        if(data == null) return;
        for (Integer d : data) {
            insert(d);
        }
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return root==null;
    }
}
