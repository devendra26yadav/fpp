package Practice.Quiz.Quiz3.Exceptions;

import java.util.Arrays;
import java.util.List;

public class Test9 {
    public static void main(String[] args) {
        try {
            List<String> list = Arrays.asList("A", "B");
            list.add("C");
        } catch (UnsupportedOperationException e) {
            System.out.println("Not supported!");
        }

    }
}
