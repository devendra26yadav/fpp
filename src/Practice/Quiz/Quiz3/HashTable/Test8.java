package Practice.Quiz.Quiz3.HashTable;

import java.util.HashMap;

public class Test8 {
    public static void main(String[] args){
        HashMap<Integer,String> m = new HashMap<>();
        m.put(1,"A"); m.put(2,"B");
        for(Integer k : m.keySet()){
            m.put(3,"C"); // Exception in thread "main" java.util.ConcurrentModificationException
        }

    }
}
