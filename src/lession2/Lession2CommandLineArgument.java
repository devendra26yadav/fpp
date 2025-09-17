package lession2;

import java.util.Arrays;

public class Lession2CommandLineArgument {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));

        StringBuilder temp = new StringBuilder("[");
        for(int i=0;i<args.length-1;i++){
            temp.append(args[i]);
            temp.append(",");
        }
        temp.append(args[args.length-1]);
        temp.append("]");
        System.out.println(temp);
    }
}
