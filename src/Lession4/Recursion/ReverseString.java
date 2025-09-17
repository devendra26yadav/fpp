package Lession4.Recursion;

public class ReverseString {
    public static void main(String[] args) {
        reverse("World");
    }
    public static void reverse(String s){
        if(s==null || s==""){
            return ;
        }
        reverse(s.substring(1));
        System.out.print(s.charAt(0));
    }
}
