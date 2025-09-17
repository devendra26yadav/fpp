package Lession4.Recursion;

public class LinearSearch {

    public static void main(String[] args) {
        System.out.println(linearSearch(new Object[]{1,4,6,8},6));
    }
    public static int linearSearch(Object[] items,Object target){
        return search(items,target,0);
    }
    private static int search(Object[] items,Object target,int pos){
        return pos;
    }
}
