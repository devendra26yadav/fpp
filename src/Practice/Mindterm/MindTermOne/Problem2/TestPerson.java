package Practice.Mindterm.MindTermOne.Problem2;

import java.util.Arrays;

public class TestPerson {
    public static void main(String[] args) {
        Person[] persons = {
                new Student("Alice",24,3.6),
                new Student("Zennie",26,3.5),
                new Student("Bob",31,3.9),
                new Employee("Harry",34,"IT Department")
        };

        Arrays.sort(persons,(p1,p2)->p1.name.compareTo(p2.name));
        for(Person p:persons){
            System.out.println(p.getRoleDescription());
        }
    }
}
