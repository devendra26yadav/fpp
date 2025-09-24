package Practice.Quiz.Quiz3.HashTable;

import java.util.*;

class Test1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(null, "A");
        map.put(null, "B");
        System.out.println(map);
       // {null=B} - (Only last value survives for null key.)

    }
}
