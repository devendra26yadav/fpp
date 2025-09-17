package Lession8.day1.ArrayListDemo;

import java.util.*;

public class MyArrayList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add(1,"HTTP");
        System.out.println(list);
        System.out.println(list.get(1));
        list.addLast("System");
        System.out.println(list);
        System.out.println("Capacity : "+list.size());
//        System.out.println(list.stream().count());

        int index =2;
        String setString ="Language";
        System.out.println("Setting at "+index+" : "+setString);
        list.set(index,setString);
        System.out.println(list);

        //Apple List
        System.out.println("Apples listing...");
        List<Apple> apples = new ArrayList<>(
                Arrays.asList
                        (new Apple()
                                ,new Apple("Black",2.3,1.8)));
        Apple a2 = new Apple();
        apples.add(a2);
        apples.add(new Apple("Green",1.7,1.3));
        System.out.println(apples);
        // printing apples
        for(Apple a:apples){
            System.out.println(a);
        }
        System.out.println("Using indexed based for start");
        for(int i=0;i<apples.size();i++){
            Apple o = apples.get(i);
            System.out.println(o);
        }
        System.out.println("Using indexed based for end");

        int count =0;
        for(Apple a:apples){
            if(a.getWt()>2){
                count++;
            }
        }
        System.out.println(count);

        //
        System.out.println("Printing Apple collection using iterator");
        Iterator<Apple> it =apples.iterator();
        while(it.hasNext()){
            Apple a = it.next();
            System.out.println(a);
        }
        System.out.println("Printing Apple collection using List iterator");
        // To traverse in both direction , add ,remove
        ListIterator<Apple> it1 = apples.listIterator(apples.size()-1);
        while (it1.hasPrevious()){
            System.out.println(it1.previous().getPrice());
        }
    }
}
