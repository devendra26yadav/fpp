package Practice.Quiz.Quiz3.Exceptions;

import java.util.Arrays;
import java.util.List;

public class MyUnsupportedOperationException {
    public static void main(String[] args) {
        try {
            List<String> list = Arrays.asList("A", "B");
            list.add("C");  // Unsupported
            System.out.println("Added");
        }
//        catch (UnsupportedOperationException e) {
//            System.out.println("Operation not supported");
//        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
