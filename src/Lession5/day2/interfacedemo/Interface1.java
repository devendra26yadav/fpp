package Lession5.day2.interfacedemo;

// interface only says what to do - not how to do
public interface Interface1 {
    // no constructor
    // interface1 ob = new Interface1() - Error
    // can interface have fields - No
    // Interface includes only static constant fields
    int x = 10 ; // it is public static final x = 10;
    public static final int y = 45; // default

    // Interface include abstract methods , implemented methods
    int add(int x, int y); // equivalent to public abstract int add(int x, int y);

    public abstract int sub(int a, int b);

}
