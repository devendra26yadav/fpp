package Lession6.sort2;

import java.util.Arrays;
import java.util.Comparator;
// Sort1-Outside Comparator
import Lession6.sort2.Person;

/**
 * Processes person data. Makes use of an external NameComparator class
 */
public class PersonData {
    public static Person[] prepareData() {
        Person[] persons =
                {new Person("Joe", "Brown", 4566.56),
                        new Person("Bob", "Roth", 3455.23),
                        new Person("Anne", "Mary", 6788.90),
                        new Person("Tim", "Cook", 2345.67),
                        new Person("Rosy", "Cook", 4567.88)};
        return persons;
    }

    public static void main(String[] args) {
        Person[] persons = prepareData();
        // Outside Name Comparator
        System.out.println("Before Sorting: " + Arrays.toString(persons));

//        PersonData p = new PersonData();
        new PersonData().mySort(persons);

        System.out.println("After Sorting: " + Arrays.toString(persons));

    }

    public void mySort(Person[] arr) {
        // Perform
        class MyLocalSort implements Comparator {

            @Override
            public int compare(Object o1, Object o2) {
                Person p1 = (Person) o1;
                Person p2 = (Person) o2;
                String fn1 = p1.getFname();
                String fn2 = p2.getFname();
                return fn2.compareTo(fn1);
            }
        }
        Arrays.sort(arr, new MyLocalSort());
    }

}
