package Practice.Quiz.Quiz3.HashTable;

import java.util.Hashtable;

public class Test2 {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();
        table.put(null, "A");
        System.out.println(table);
        // Cannot invoke "Object.hashCode()" because "key" is null
    }
}
