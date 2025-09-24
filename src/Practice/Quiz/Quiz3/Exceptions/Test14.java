package Practice.Quiz.Quiz3.Exceptions;

public class Test14 {
    public static void main(String[] args)  {
        try {
            throw new Exception("EX");
        }
        catch (ArithmeticException e) {
            System.out.println("Caught");
        }
        // try commenting the below catch block and run the program to see what happens next
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
