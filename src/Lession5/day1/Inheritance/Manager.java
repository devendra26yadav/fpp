package Lession5.day1.Inheritance;

// I want to Inherit Employee, Manager is a Employee
// use the keyword extends Parent class name in your child class
public class Manager extends Employee {
    // You can include additional attributes, behavior in your child class
    private double bonus;

    public Manager(String aName, double aSalary, int aYear, int aMonth, int aDay) {
        // Always super is the first line
        // But JDK 22, validating arguments are allowed before passing to super
        // Refer:https://openjdk.org/jeps/447
        // validation
//        if(aName==null){
//            throw new NullPointerException("Empty name");
//        }
        super(aName, aSalary, aYear, aMonth, aDay);
        System.out.println("Manager constructor");
    }

    public Manager() {
        super();
    }

    public void setBonus(double b) {
        bonus = b;
    }

    public static void getMaxSalary(Employee[] coll){
        String name=null;
        double maxSal = -1;
        double avg =0;
        int count=0;
        for(Employee e :coll){
            if( e instanceof Manager m){
                if(m.getSalary() > maxSal){
                    maxSal =m.getSalary();
                    name=m.getName();
                    avg+=maxSal;
                }
            }
            count++;
        }
        System.out.println("Max Slary : "+maxSal);
        System.out.println("Name : "+name);
        System.out.println("Average Salary : "+avg/count);
        System.out.println("Total Slary : "+avg);
    }

    /* Overriding - You can customize the parent behavior in your child class
     * Dynamic binding, late binding
     * You have to follow the same signature from the Parent
     * override the behaviour of getSalary()
     * @Override - Annotation is for readability as well as compiler verification
     *  getSalary() can declare with the same visibility or higher visibility modifier
     */
    @Override
    public double getSalary() {
        // 	return getSalary() + bonus; // Calling itself
        // salary is private, need to call parent salary
        return super.getSalary() + bonus;
    }
}