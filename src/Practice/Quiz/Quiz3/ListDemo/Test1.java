package Practice.Quiz.Quiz3.ListDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        System.out.println(l1);

        List<Integer> l2 = new ArrayList<Integer>(){
            {
                add(1);
                add(2);
                add(3);
            }
        };
        System.out.println(l2);
        List<Integer> l3 = Arrays.asList(1,2,3);
        System.out.println(l3);
        List<Integer> l4 = List.of(1,2,3);
        System.out.println(l4);
        var it = l4.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
