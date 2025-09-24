package Practice.Quiz.Quiz3.Exceptions;

import java.util.Arrays;
import java.util.Iterator;

public class MyIllegalStateException {
    public static void main(String[] args) {
        try {
            Iterator<Integer> it = Arrays.asList(1,2,3).iterator();
            it.remove(); // invalid, remove before next()
        } catch (IllegalStateException e) {
            System.out.println("Illegal state used");
        }

    }
}
