package Practice.Final.MyHashTable.Set2.Prob2;

import java.util.*;

public class EmployeeAdmin {
	
	/**
		
	Your method prepareReport should return a list of all Employees in the input table 
	whose social security number is in the input list socSecNums and whose salary is greater than $80,000. 
	In addition, this list of Employees must be sorted by social security number, in ascending order (from numerically smallest to numerically largest).
	*/
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		//IMPLEMENT
		List<Employee> reports = new ArrayList<>();
		for(String ssn:socSecNums){
			if(table.containsKey(ssn) && table.get(ssn).getSalary()>80000){
				reports.add(table.get(ssn));
			}
		}
		Collections.sort(reports, Comparator.comparing(Employee::getSalary));
		return reports;
		
	}
	
}
