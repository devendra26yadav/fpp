package Practice.Quiz.Quiz3.HashTable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Employee {
    String id;      // unique
    String name;
    int salary;

    Employee(String id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee e = (Employee) o;
        // ❌ Only comparing id
        //return id.equals(e.id);
        return Objects.equals(id,((Employee) o).id);
    }

    @Override
    public int hashCode() {
        // ❌ Only using id
        return id.hashCode();
    }
}


public class Test10 {
    public static void main(String[] args) {
        Map<Employee, String> map = new HashMap<>();

        Employee e1 = new Employee("E101", "Alice", 50000);
        Employee e2 = new Employee("E101", "Bob", 70000); // same id, different details

        map.put(e1, "Manager");

        // containsKey() uses equals() + hashCode()
        System.out.println(map.containsKey(e2)); // true ✅
        System.out.println(map.get(e2));        // Manager ✅
        System.out.println("\u2705");
        System.out.println((map.containsKey(new Employee("E101","lice",90000))));
        Map<String,Integer> m2 = new HashMap<>();
        m2.put("Hello",2);
        m2.put(null,4);
        m2.put("Soni",7);
        m2.put("null",9);
        System.out.println(m2.get("Soni"));
        System.out.println(m2.get(null));
        System.out.println(m2.get("null"));
        System.out.println(m2.get("Happy"));
        System.out.println("String");
        String [] s = new String[4];
        System.out.println(s[3].length());
    }
}
