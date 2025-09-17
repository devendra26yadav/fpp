package Lession5.day2.interfacedemo;

public class Java8InterfaceTest {

    public static void main(String[] args) {
        Java8InterfaceTest ob = new Java8InterfaceTest();
        System.out.println(ob.area(4));
        Java8Interface.printDecimal(789);
    }
    int area(int side){
        return side*side;
    }
}
