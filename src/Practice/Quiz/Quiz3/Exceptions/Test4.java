package Practice.Quiz.Quiz3.Exceptions;

import java.io.IOException;

public class Test4 {
    public static void main(String[] args)  {

        try {
            throw new IOException("Checked Exception");
        }
        finally {
            System.out.println("Finally");
            throw new RuntimeException("From finally");
        }

    }
}
