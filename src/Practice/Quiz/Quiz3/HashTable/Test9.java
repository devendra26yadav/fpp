package Practice.Quiz.Quiz3.HashTable;

import java.util.HashMap;
import java.util.Objects;

class Key2{
    String name;
    Integer id;
    public Key2(String name, Integer id){
        this.name=name;
        this.id=id;
    }

    @Override
    public String toString() {
        return "name="+name+", id="+id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Key2 key2 = (Key2) o;
        return Objects.equals(id, key2.id) && Objects.equals(name,key2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash( name,id);
    }
}

public class Test9 {
    public static void main(String[] args) {
        HashMap<Key2,Integer> map= new HashMap<>();
        Key2 k1 = new Key2("John",3);
        Key2 k2 = new Key2("Dev",3);
        Key2 k3 = k2;
        map.put(k1,3);
        map.put(k2,4);
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(k1==k2);
        System.out.println(k3==k2);
        System.out.println(k1.equals(k2));

        System.out.println(map.containsKey(new Key2("John",3)));
//        System.out.println(k1.hashCode());
//        System.out.println(k2.hashCode());
//        System.out.println(System.identityHashCode(k1));
//        System.out.println(System.identityHashCode(k2));

    }
}
