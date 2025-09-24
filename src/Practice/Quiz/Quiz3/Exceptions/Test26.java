package Practice.Quiz.Quiz3.Exceptions;

public class Test26 {
    public static void main(String[] args) {
        try {
            throw new Exception("Checked");
        }
        catch (Exception e) {
            throw new RuntimeException("New one");
        }
//        finally {
//            throw new RuntimeException("I Am Final");
//        } // exception message will be "I Am Final"
    }
}
