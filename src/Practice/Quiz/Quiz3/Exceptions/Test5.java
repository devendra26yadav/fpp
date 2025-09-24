package Practice.Quiz.Quiz3.Exceptions;

public class Test5 {
    public static void main(String[] args) {
         /*
        try {
            throw new Exception("Checked!");
        } catch (RuntimeException e) {
            System.out.println("Runtime");
        }
        Answer: Compile-time error.
        Explanation: Exception is checked. You can’t catch it with RuntimeException.
         */
        try {
            throw new Exception("Checked!");
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
        }


    }
}
