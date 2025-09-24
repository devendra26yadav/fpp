package Practice.Quiz.Quiz3.Exceptions;

public class Test11 {
    public static void main(String[] args)  {
        int a =9;
       try
       {
           if(a<10){
               throw new Exception("Checked");
           }
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
    }
}
