package Lession10.BinarySearchTree;

public class TestBST {
    public static void main(String[] args) {
        BST bst = new BST();
        bst.makeBST(new Integer[]{2, 8, 1, 7,-6,9,4});
        bst.preOrder();
        bst.inOrder();
        bst.postOrder();
        System.out.println("Root Element : "+bst.getRoot());
        System.out.println(bst.contains(8));
        System.out.println(bst.contains(3));
        System.out.println("Number of leaf node : "+bst.countLeafNode());
        System.out.println("Minimum value : "+bst.findMin());
        System.out.println("Max value : "+bst.findMax());


    }
}
