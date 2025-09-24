package Practice.Quiz.Quiz3.Exceptions;

import java.io.IOException;

public class MyIOException {
    public static void main(String[] args) throws IOException {
        try {
            throw new IOException("Checked Exception");
        } finally {
            System.out.println("Finally runs");
        }

    }
}
