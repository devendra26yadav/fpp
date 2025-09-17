package Lession4.JUnitTest;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyClassTest {
    @Test
    public void test1() {
        int act = MyClass.fact(5);
        int exp = 120;
        assertEquals(exp, act);
    }

    @Test
    public void test2() {
        int act = MyClass.fact(4);
        int exp = 24;
        assertEquals(exp, act);
    }

    @Test
    public void test3() {
        int act = MyClass.sum(4);
        int exp = 10;
        assertEquals(exp, act);
    }
    @Test
    public void test4(){
        int actual = MyClass.sum(3);
        int exp =6;
        assertEquals(exp,actual);
    }
}