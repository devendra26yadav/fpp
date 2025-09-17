package Lession6.sort1;

import java.util.Arrays;
import java.util.Comparator;
// Sort1-Outside Comparator
import Lession6.sort1.Person;
/** Processes person data. Makes use of an external NameComparator class */
public class PersonData {
	public static Person[] prepareData() {
		Person[] persons =
			{new Person("Joe","Brown",4566.56),
					new Person("Bob","Roth",3455.23),
			 new Person("Anne","Mary",6788.90),
					new Person("Tim","Cook",2345.67),
			 new Person("Rosy","Cook",4567.88)};
		return persons;
	}
	public static void main(String[] args) {
		Person[] persons = prepareData();
		// Outside Name Comparator
		System.out.println("Before Sorting: " + Arrays.toString(persons));

		PersonData p = new PersonData();
		Arrays.sort(persons,p.getMySort());

		System.out.println("After Sorting: " + Arrays.toString(persons));
		
	}

	// Perform
	private class MySort implements  Comparator<Person>{

		@Override
		public int compare(Person o1, Person o2) {

			String fn1 = o1.getFname();
			String fn2 = o2.getFname();
			return fn1.compareTo(fn2);
		}
	}
	private MySort getMySort(){
		return new MySort();
	}
}
