package Practice.Quiz.Quiz3.Exceptions;

public class Test24 {
    public static void main(String[] args) throws Exception {
        try {
            throw new Exception("Checked");
        } catch (RuntimeException e) {
            System.out.println("Caught Runtime");
        } finally {
            System.out.println("Finally runs");
        }
    }
}
