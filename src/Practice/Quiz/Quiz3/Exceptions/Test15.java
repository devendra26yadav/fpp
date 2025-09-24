package Practice.Quiz.Quiz3.Exceptions;

public class Test15 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("R");
        } finally {
            System.out.println("Finally runs");
            // try commenting below line to see changes
            throw new ArithmeticException("Arithmetic");

        }

    }
}
