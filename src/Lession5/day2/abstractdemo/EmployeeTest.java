package Lession5.day2.abstractdemo;

public class EmployeeTest {
    public static void main(String[] args) {
        // we can not create an object of abstract class
//        Employee e = new Employee();
        Manager m1 = new Manager("Peter",4,2023,8,13);
        m1.getFun();
        Manager m2 = new Manager("John",3,2023,8,13);

        Executive e1 = new Executive("Shu",3,2023,8,13);
        Executive e2 = new Executive("Tom",5,2023,8,13);
        m1.setBonus(5);
        m2.setBonus(5);
        e1.setNumberOfShares(20);
        e2.setNumberOfShares(30);

        Employee [] arr = {m1,m2,e1,e2};
        double total =0;
        for(Employee e : arr){
            System.out.println(e.getClass().getSimpleName());// Runtime class name
            System.out.println(e.getName());
            total+=e.getNetPay();
        }
        System.out.printf("Total Net Salary : $%f",total);



    }
}
