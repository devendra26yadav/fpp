package Practice.Inheritance;

public class Employee {
    private String name;
    private int age;
    static String companyName="ABC";
   public  Employee(){

    }
    public Employee(int x){
       age=x;
    }
    void display(){
        System.out.println("Display ------------ Starts ");
        System.out.println("Instance Var age : "+age);
        System.out.println("Static Var companyName = "+companyName);
        details();
        System.out.println("Display ------------ Ends ");

    }
    static void details(){
//        System.out.println(name);
        System.out.println("Static Var companyName = "+companyName);
        // what if i want to access instance var in static method
        Employee e = new Employee(50);
        System.out.println("From Static Method -> Instance variable age = "+e.age);

    }
}
