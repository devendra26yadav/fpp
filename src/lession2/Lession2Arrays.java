package lession2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lession2Arrays {
    public static void main(String[] args) {
        // Array
        int x = 20;
        int [] coll; // declared
        coll = new int[10] ; // allocate 10 consecutive memory
        // Arrays.toString(name) to print

        String input="Hello,strings can be fun. They have many uses.";

        String [] ret  = input.split(",| |\\. |\\.");
        System.out.println(Arrays.toString(ret));

        // arrayCopy - method
        // Arrays.copyOf(arr,newLength) - when we resize wanted
        //Collections.clone() - useful when we want to copy of another array eg arr.clone()
        //Arrays.copyOfRange(arrayname, from , to) - excluding 'to'

    }
}
