package Lession8.day1.collectionssort;

import java.util.Comparator;

public class LastNameComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getLname().compareTo(o2.getLname());
    }
}
