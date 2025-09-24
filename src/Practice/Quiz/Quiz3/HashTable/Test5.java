package Practice.Quiz.Quiz3.HashTable;

import java.util.HashMap;

public class Test5 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(10, "A");
        map.put(10, "B");
        System.out.println(map);
        //{10=B}
    }
}
