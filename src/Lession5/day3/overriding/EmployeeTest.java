package Lession5.day3.overriding;


public class EmployeeTest {

    public static void main(String[] args) {
        Employee e1 = new Employee("Tom",345);
        Employee e2 = new Employee("Tom",345);
        Employee e3 = new Employee("Anne",345);
        System.out.println(e1);
        System.out.println(e1.toString());
        // if not overridden the equal method it will return false on same data
        System.out.println(e1.equals(e2));
    }
}
