package Lession8.day1.collectionssort;

import java.time.LocalDate;
import java.util.Objects;

public class Employee  implements Comparable<Employee>{
	// instance fields
	private String fname;
	private String lname;
	private LocalDate hireDay;

	// constructor
	public Employee(String fname, String lname, LocalDate hireDay) {
		this.fname = fname;
		this.lname = lname;
		this.hireDay = hireDay;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}
	@Override
	public String toString() {
		return "Employee{" +
				"fname='" + fname + '\'' +
				", lname='" + lname + '\'' +
				", hireDay=" + hireDay +
				'}';
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if(o==null) return false;
		if (!(o instanceof Employee employee)) return false;
		// fname.equals(employee.fname) replace with Objects.equals()
        return Objects.equals(fname, employee.fname)
				&& Objects.equals(lname, employee.lname)
				&& Objects.equals(hireDay, employee.hireDay);
	}
	// sort by natural order by first name
	@Override
	public int compareTo(Employee o) {
		return this.fname.compareTo(o.fname);
	}
	/*@Override
	public int hashCode() {
		return Objects.hash(fname, lname, hireDay);
	}*/
}
