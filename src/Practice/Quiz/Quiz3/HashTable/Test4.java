package Practice.Quiz.Quiz3.HashTable;

import java.util.Hashtable;

public class Test4 {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();
        table.put(1, null);
        //Exception in thread "main" java.lang.NullPointerException
    }
}
