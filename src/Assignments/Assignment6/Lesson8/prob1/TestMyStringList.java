package Assignments.Assignment6.Lesson8.prob1;


public class TestMyStringList {

    public static void main(String[] args) {
       MyStringList list = new MyStringList();
        list.add("Java");
        System.out.println(list);
        list.add("HTML");
        System.out.println(list);
        list.add("PHP");
        System.out.println(list);
        list.add("Python");
        System.out.println(list);
        System.out.println("Index of PHP : "+list.indexOf("PHP"));
        list.removeAt(2);
        System.out.println(list);
        list.removeAt(0);
        System.out.println(list);
        list.removeAt(1);
        System.out.println(list);
        list.clear();
        System.out.println(list);
        list.add("Javascript");
        System.out.println(list);
       MyStringList l2 = new MyStringList();
        l2.add("Javascript");
        l2.add("PHP");
        l2.add("HTML");
        l2.add("Node");
     System.out.println(list.set(1,"Rubby"));
        System.out.println( list.containsAll(l2));
        System.out.println( l2.subList(1,2));
        System.out.println(list);
        list.insert("Jack",1);
        list.insert("Go Lang",2);

        System.out.println(list);
        list.remove("Jack");
        System.out.println(list);
    }
}

/*
Sample Output:
[Java]
[Java, HTML]
[Java, HTML, PHP]
[Java, HTML, PHP, Python]
Index of PHP : 2
[Java, HTML, Python]
[HTML, Python]
[HTML]
[HTML]
[HTML, Javascript]
Javascript
false
[PHP]
[HTML, Rubby]
[HTML, Jack, Go Lang, Rubby]
[HTML, Go Lang, Rubby]
 */