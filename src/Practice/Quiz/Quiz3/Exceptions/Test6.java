package Practice.Quiz.Quiz3.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test6 {
    public static void main(String[] args) throws Exception {
//        try {
//
//        } catch (FileNotFoundException e) {
//            System.out.println("File missing!");
//        }
        FileReader fr = new FileReader("missing.txt");

    }
}
