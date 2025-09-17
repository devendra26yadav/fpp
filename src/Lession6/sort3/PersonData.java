package Lession6.sort3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
// Sort1-Outside Comparator
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

        // Annonymous implementation - sort by last anem
        // comparator is functional interface
        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLname().compareTo(o2.getLname());
            }
        });

        System.out.println("After Sorting with last name : " + Arrays.toString(persons));

        // sorting by firstname
        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFname().compareTo(o2.getFname());
            }
        });
        System.out.println("After Sorting with first name : " + Arrays.toString(persons));

        Arrays.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Double.compare(o1.getSalary(), o2.getSalary());
            }
        });
        System.out.println("After Sorting by salary : " + Arrays.toString(persons));

        //
        System.out.println("Sorting with lambdas");
        Arrays.sort(persons,(p1,p2)->p2.getLname().compareTo(p1.getLname()));
        System.out.println("After Sorting by last name : " + Arrays.toString(persons));
        System.out.println("Sorting by salary with lambdas");
        Arrays.sort(persons,(p1,p2)->Double.compare(p2.getSalary(),p1.getSalary()));
        System.out.println("After Sorting by salary using lambdas : " + Arrays.toString(persons));
    }

}
