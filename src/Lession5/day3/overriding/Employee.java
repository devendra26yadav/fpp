package Lession5.day3.overriding;

import java.util.Objects;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Name : " + this.name + " Salary : " + this.salary;
    }
    @Override
    public boolean equals(Object o) {
        // check the null pointer exception
        if (o == null || getClass() != o.getClass())
            return false;

        // converting the object o into Employee type
        Employee employee = (Employee) o;
        return salary == employee.salary && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary);
    }
}
