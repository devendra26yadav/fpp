package Practice.Quiz.Quiz3.HashTable;

import java.util.HashMap;

public class Test7 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "A");
       map.remove(1, "B"); // remove key 1 if only value match
       // map.remove(1, "A");
        System.out.println(map);
    }
}
