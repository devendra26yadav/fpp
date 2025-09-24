package Practice.Quiz.Quiz3.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test19 {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fr = new FileReader("missing.txt");
    }
}
