package Practice.Overloading;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Overloading1 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(2, 3));       // calls int version
        System.out.println(c.add(2.5, 3.5));   // calls double version
        System.out.println(c.add(1, 2, 3));    // calls 3-param version
    }
}

