package Practice.Quiz.Quiz3.Exceptions;

public class Test23 {
    public static void main(String[] args) throws Exception {
        try {
            throw new Exception("Checked");
        } finally {
            System.out.println("Finally always runs");
        }
    }
}
