package Practice.Quiz.Quiz3.Exceptions;

public class Test10 {
    public static void main(String[] args) {
        try{
//            System.out.println(4/0);
            int [] arr={2,4,6};
            System.out.println(arr[-1]);
        }catch (Throwable e){
            System.out.println(e.getMessage());
        }
    }
}
