package Lession6.innerclass;

public class TestMyClass {
    public static void main(String[] args) {
        MyClass m = new MyClass();

        // ctrating an object of inner classs (if not private)
        // Inner ob = new Inner(); // not correct way
        MyClass.Inner ob = new MyClass().new Inner();
        MyClass.Inner ob2 = m.new Inner();
        ob2.display();
    }
}
