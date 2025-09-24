package Practice.Quiz.Quiz3.Exceptions;

public class Test8 {
    public static void main(String[] args) {
        try {
            Integer.parseInt("xyz");
        } catch (NumberFormatException e) {
            System.out.println("Bad number");
        }

    }
}
