package Assignments.Assignment8.lesson11.Prob2;

import java.util.*;

public class EmployeeAdmin {

    /**
     * Your method prepareReport should return a list of all Employees in the input table
     * whose social security number is in the input list socSecNums and whose salary is greater than $80,000.
     * In addition, this list of Employees must be sorted by social security number, in ascending order (from numerically smallest to numerically largest).
     */
    public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
        //IMPLEMENT
        if (table == null || socSecNums == null) return null;
        List<Employee> reports = new ArrayList<>();
        int salaryThreshold = 80000;
        for (String ssn : socSecNums) {
            Employee emp = table.get(ssn);
            if (emp != null && emp.getSalary() > salaryThreshold) {
                reports.add(emp);
            }
        }
        //reports.sort(Comparator.comparing(Employee::getSsn));
		/*
		reports.sort(Comparator.comparing(Employee::getSsn)
				.thenComparing(Employee::getName)
				.thenComparing(Employee::getSalary));

		 */
       // Collections.sort(reports,Comparator.comparing(Employee::getSsn));

        reports.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if (e1 == null && e2 == null) return 0;
                if (e1 == null) return 1;
                if (e2 == null) return -1;
                int cmp = e1.getSsn().compareTo(e2.getSsn());
                if (cmp != 0) return cmp;
                cmp = e1.getName().compareTo(e2.getName());
                if (cmp != 0) return cmp;
                return Double.compare(e1.getSalary(), e2.getSalary());
            }
        });
        return reports;

    }

}
