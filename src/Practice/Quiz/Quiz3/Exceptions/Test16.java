package Practice.Quiz.Quiz3.Exceptions;

public class Test16 {
    public static void main(String[] args) {
        try {
            throw new Error("Severe");
        } catch (Throwable t) {
            System.out.println("Caught: " + t.getMessage());
            System.out.println(t);
        }

    }
}
