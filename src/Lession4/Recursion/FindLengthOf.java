package Lession4.Recursion;

public class FindLengthOf {

    public static void main(String[] args) {
        System.out.println(findChar("hello","e"));
    }
    public static boolean findChar(String s,String c){

        if(s.isEmpty()){
            return false;
        }
        if(s.contains(c)){
            return true;
        }
        if(!s.contains(c)){
            return  false;
        }

        return findChar(s.substring(s.length()-1),c);

    }
}
