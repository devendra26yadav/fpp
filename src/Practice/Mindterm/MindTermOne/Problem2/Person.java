package Practice.Mindterm.MindTermOne.Problem2;

abstract public class Person {
    String name;
    int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    abstract String getRoleDescription();
    public String toString(){
        return String.format("Name: %s, Age: %d",name,age);
    }
}

class Student extends Person{
    double gpa;
    public Student(String name,int age,double gpa){
        super(name,age);
        this.gpa=gpa;
    }
    @Override
    String getRoleDescription(){
        return super.toString()+" Role : Student GPA "+this.gpa;
    }

}
class Employee extends Person{
    String department;
    public Employee(String name,int age,String department){
        super(name,age);
        this.department=department;
    }
    @Override
    String getRoleDescription(){
        return super.toString()+" Role : Employee from "+this.department;
    }
}