package Lession4.Recursion;

public class Prog2 {

    public static void main(String[] args) {
        printSpace(53678);
    }
    public static void printSpace(int n){
        if(n>0) {
            printSpace(n/10);
            System.out.print(n % 10 + " ");
        }
    }
}
/*

Sample Output:

5 3 6 7 8

 */