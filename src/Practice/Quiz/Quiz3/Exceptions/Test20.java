package Practice.Quiz.Quiz3.Exceptions;

public class Test20 {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException("Divide by zero");
        } catch (Exception e) {
            System.out.println("Caught: " + e.getClass().getSimpleName());
        }
    }
}
