package Practice.Quiz.Quiz3.Exceptions;

public class Test27 {
    public static void main(String[] args) {
        try {
            throw new Exception("Checked");
        }
        // here no catch block because finally overrides with new exception which is RuntimeException
        finally {
            throw new ArithmeticException("AR");
            // try removing comment of below line and adding comment of the above line to see the result with differences
            //throw new Exception("Checked");
        }
    }
}
