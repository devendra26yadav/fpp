package Practice.Quiz.Quiz3.Exceptions;

public class Test13 {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException("Math");
        } catch (Exception e) {
            System.out.println("Caught");
        }

    }
}
