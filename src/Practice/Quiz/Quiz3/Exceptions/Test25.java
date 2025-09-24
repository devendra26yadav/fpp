package Practice.Quiz.Quiz3.Exceptions;

public class Test25 {
    public static void main(String[] args) {
        try {
            throw new NullPointerException("Null!");
        } finally {
            System.out.println("Cleanup done");
        }
    }
}
