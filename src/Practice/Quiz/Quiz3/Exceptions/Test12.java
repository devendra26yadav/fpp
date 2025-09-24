package Practice.Quiz.Quiz3.Exceptions;

public class Test12 {
    public static void main(String[] args) {
        System.out.println(m1());
        System.out.println(m1()+m2());
    }
    public static int m1(){
        try{
            return 2;
        }catch (Exception e){
            System.out.println("m1 catch "+e.getMessage());
        }
        finally {
            return 5;
        }
    }
    public static int m2(){
        try{
            return 8;
        }catch (Exception e){
            System.out.println("m2 catch "+e.getMessage());
        }
        return 10;
    }
}
