package Practice.Quiz.Quiz3.Exceptions;

public class MyClassCastExceptions {
    public static void main(String[] args) {
        try {
            Object x = new Integer(10);
            String s = (String) x;
        } catch (ClassCastException e) {
            System.out.println("Invalid cast");
        }
       try{
           Object y = Integer.valueOf(23);
           String z = (String) y;
           System.out.println(z);
       }catch (ClassCastException e){
           System.out.println(e.getMessage());
       }

    }
}
