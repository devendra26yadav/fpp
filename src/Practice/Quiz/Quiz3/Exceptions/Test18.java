package Practice.Quiz.Quiz3.Exceptions;

import java.io.IOException;

public class Test18 {
    public static void main(String[] args) throws IOException {
        try {
            throw new IOException();
        } catch (IOException e) {
            throw e;
//            try {
//                throw e;
//            } catch (Exception k) {
//                System.out.println(k);
//            }

        }
    }
}
