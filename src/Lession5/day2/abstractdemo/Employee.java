package Lession5.day2.abstractdemo;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Super class/ Parent class
public abstract class Employee {
    // instance fields
    private String name;
    private double salary;
    private LocalDate hireDay;

    // Default Constructor
//    public Employee() {
//        name="Unknown";
//        salary = 0.0;
//        hireDay = null;
//        System.out.println("Employee Constructor");
//    }

    // constructor
    Employee(String aName, double aSalary, int aYear, int aMonth, int aDay) {
        name = aName;
        salary = aSalary;
        hireDay = LocalDate.of(aYear, aMonth, aDay);
        System.out.println("Employee params constructor");
    }

    public Employee() {

    }

    // instance methods
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getHireDay() {
        final String DATE_PATTERN = "MM/dd/yyyy";
        return hireDay.format(DateTimeFormatter.ofPattern(DATE_PATTERN));
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
    // all abstract methods must be implemented in side the child class
    public  abstract  void getFun();
    public abstract double getNetPay();
}