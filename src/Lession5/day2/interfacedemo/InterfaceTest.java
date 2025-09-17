package Lession5.day2.interfacedemo;

import org.junit.jupiter.api.TestInstance;

public class InterfaceTest implements Interface1 {

    public static void main(String[] args) {
        InterfaceTest ob = new InterfaceTest();
        System.out.println(ob.add(4,7));
        System.out.println(ob.sub(9,7));

        // only interface fields can only be called using interfacename.fields name
        int k = InterfaceTest.x;
        System.out.println("K = "+k);
        Interface1 I1 = new InterfaceTest(); // thats how to achieve inheritance
        System.out.println(I1.add(9,8));

    }

    @Override
    public int add(int x, int y) {
        return x+y;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }
}
