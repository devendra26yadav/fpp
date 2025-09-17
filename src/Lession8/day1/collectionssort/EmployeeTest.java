package Lession8.day1.collectionssort;



import java.time.LocalDate;
import java.util.*;

public class EmployeeTest {
    public static void main(String[] args) {
        // Sort a list of String
        List<String> names = new ArrayList<>(
                Arrays.asList("John", "Liya","David","Dawit","Yadav","Khan","Badri","Mohanraj"));
        // Sort names collections in natural order

        Collections.sort(names);
        System.out.println("Natural Order list");
        System.out.println(names);
        // Sort names collections in Reversed order
        Collections.sort(names,Collections.reverseOrder());
        System.out.println("Reversed Order list");
        System.out.println(names);

        List<String> names1 = new ArrayList<>(
                Arrays.asList("John", "Liya","David","Dawit","Yadav","Khan","Badri","Mohanraj"));
        // for using binary search first sort the collection then apply binary search
        Collections.sort(names1);
       int result= Collections.binarySearch(names1,"Yadav");
        System.out.println(result);
        System.out.println(Collections.binarySearch(names1,"Book"));


        Employee e1 = new Employee("Tom","Bruce", LocalDate.of(2014,12,12));
        Employee e2 = new Employee("Renuka","Mohanraj", LocalDate.of(2014,5,1));
        Employee e3 = new Employee("Tom","Daniel", LocalDate.of(2020,11,11));
        Employee e4 = new Employee("Tom","Bruce", LocalDate.of(2016,10,10));
        Employee e5 = new Employee("Anne","Dow", LocalDate.of(2014,12,12));

        List<Employee> list = new ArrayList<>(
                Arrays.asList(e1, e2, e3, e4, e5)
        );
        Collections.sort(list);
        System.out.println(list);

        System.out.println("Comparator");
        Collections.sort(list,new LastNameComparator());
        System.out.println(list);


        // new functional style comparing
        Collections.sort(list,Comparator.
                comparing(Employee::getLname).
                thenComparing(Employee::getFname).
                thenComparing(Employee::getHireDay));
        System.out.println(list);

    }
}
