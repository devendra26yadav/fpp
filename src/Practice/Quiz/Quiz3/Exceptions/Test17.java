package Practice.Quiz.Quiz3.Exceptions;

public class Test17 {
    public static void main(String[] args) {
        try {
            throw null;
        } catch (NullPointerException e) {
            System.out.println("Null thrown!");
            System.out.println(e.getMessage());
        }
        System.out.println("\nSecond try-catch");
        try {
            throw new NullPointerException("NOT_OK");
        } catch (NullPointerException e) {
            System.out.println("Null thrown!");
            System.out.println(e.getMessage());
        }

    }
}
