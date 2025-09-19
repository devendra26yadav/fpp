package Lession11;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicInteger;

public class TestCourse {
    public static void main(String[] args) {
        Hashtable<String,Course> table = new Hashtable<>();

        table.put("CS390", new Course("CS390","FPP"));
        table.put("CS401", new Course("CS401","MPP"));
        table.put("CS472", new Course("CS472","Algorithms"));
        table.put("CS475", new Course("CS475","Android"));
        table.put("CS572", new Course("CS572","Advanced Algorithms"));
        //  table.put(null,null); // Throw NPE
        System.out.println("1. Key set approach");
        Set<String> sets = table.keySet();

        for(String s:sets){
            Course c = table.get(s);
            if(c.getCname().startsWith("A")){
                System.out.println(c);
            }
        }
        System.out.println("My Alternative");
        for(String s:table.keySet()){
            if(table.get(s).getCname().startsWith("A")){
                System.out.println(table.get(s));
            }
        }

        System.out.println("2. Keyset Iterator");

        Iterator<String> it = table.keySet().iterator();

        while (it.hasNext()){
            Course c = table.get(it.next());
            if(c.getCname().startsWith("A")){
                System.out.println(c);
            }
        }
        System.out.println("3. Retrieve Entries, Entry<Key, Value> pair");
      Set<Entry<String,Course>> entrysets =table.entrySet();

      for(Entry<String,Course> enrty:entrysets){
          Course c = enrty.getValue();// getters to retrieve the value
          if(c.getCname().startsWith("A")){
              System.out.println(c);
          }
      }
        System.out.println("4. Retrieve Only values");
        Collection<Course> values = table.values(); // return type is collection

        for(Course c:values){
            if(c.getCname().startsWith("A")){
                System.out.println(c);
            }
        }
        System.out.println("5. Using Lambdas , we can not modify local variable, something comes from outside");
         AtomicInteger count= new AtomicInteger();
        table.forEach((key,value)->{
            if(value.getCname().startsWith("A")){
                System.out.println(value);
                count.getAndIncrement();
            }
        });
        System.out.println("Count : "+count);

        System.out.println("6. Enumeration to Iterate - only works for HashTable not HashMap");

        Enumeration<Course> courses = table.elements();
        while (courses.hasMoreElements()){
            Course c = courses.nextElement();
            if(c.getCname().startsWith("A")){
                System.out.println(c);
            }
        }

        List<String > result = get4xxLevelIDs(table);
        System.out.println(result);
//        Collections.sort(result);
       // Collections.sort(result,(s1,s2)->s2.compareTo(s1));
        Collections.sort(result,Collections.reverseOrder());
        System.out.println(result);


    }

    public static List<String> get4xxLevelIDs(Hashtable<String,Course> table){
        List<String> ret = new ArrayList<>();
        for(String s:table.keySet()){
            if(s.startsWith("CS4")){
                System.out.println(s);
                ret.add(s);
            }
        }
        return ret;
    }

}
