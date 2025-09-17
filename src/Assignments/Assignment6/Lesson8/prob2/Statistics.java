package Assignments.Assignment6.Lesson8.prob2;
import java.util.*;
public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> list) {
		if(list==null) return 0;
		double salarySum = 0;
		for(EmployeeData emp:list){
			if(emp!=null){
				salarySum+= emp.getSalary();
			}
		}
		return salarySum;
		//implement
		//compute sum of all salaries of people in aList and return
	}
}
