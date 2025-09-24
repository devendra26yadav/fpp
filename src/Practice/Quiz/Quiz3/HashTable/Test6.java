package Practice.Quiz.Quiz3.HashTable;

import java.util.HashMap;

class Key {
    int id;
    Key(int id) { this.id = id; }
    public boolean equals(Object o) { return true; }
    public int hashCode() { return 1; }
}
public class Test6 {
    public static void main(String[] args) {
        HashMap<Key, String> map = new HashMap<>();
        map.put(new Key(1), "A");
        map.put(new Key(2), "B");
        System.out.println(map.size());
    }
}
