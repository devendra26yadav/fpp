package Lession5.day2.interfacedemo;

public interface Java8Interface {
    int area(int side); // default public abstract
    // from JDK 8
    // default is not a access modifier of the level
    // default means providing default implementation
    default double peremeter(double l, double b){
        return 2*(l+b);
    }

    // static implementation - it works like utility methods
    public static void printDecimal(double value){
        System.out.println("value = "+value);
    }

}
