package Assignments.Assignment3.Recursion;

public class MaxRecursively {

    public static void main(String[] args) {

        int[] arr = {2, 7, 9, 19, 3};
        System.out.println("Max Value : "+findMax(arr));
        System.out.println("Max Element : "+findMax(new int[]{2, -4, 0, 234, 9, -456, 63}));
        System.out.println("Max Value : "+ findMax(new int[]{-2,-894,0,-783}));

    }

    public static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
       return maxHelper(arr,max,0);
    }

    private static int maxHelper(int[] arr, int max, int pos) {
        if (pos == arr.length) {
            return max;
        } else if (pos < arr.length && arr[pos] > max) {
            max = arr[pos];
        }
        max = maxHelper(arr, max, pos + 1);
        return max;
    }

}
/*
Sample Output:
Max Value : 19
Max Element : 234
Max Value : 0
 */