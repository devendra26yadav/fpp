package Practice.Quiz.Quiz3.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test7 {
    public static void main(String[] args)  {
        try {
            FileReader fr = new FileReader("missing.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File missing!");
        }



    }
}
