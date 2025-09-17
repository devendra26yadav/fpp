package Assignments.Assignment3.Recursion;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

 public class MaxRecursivelyTest {

    @Test
    public void test1(){
        int returnValue = MaxRecursively.findMax(new int[]{2, 7, 9, 19, 3});
        int expected = 19;
        assertEquals(expected,returnValue);
    }

    @Test
     public void test2(){
        int result=MaxRecursively.findMax(new int[]{2, -4, 0, 234, 9, -456, 63});
        int exp = 234;
        assertEquals(exp,result);
    }
    @Test
     public void test3(){
        assertEquals(0, MaxRecursively.findMax(new int[]{-2,-894,0,-783}));

    }

}