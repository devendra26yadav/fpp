package Practice.Exceptions;

public class Test2 {
    public static int testMethod() {
        try {
            return 1;
        } finally {
            System.out.println("In finally");
        }
    }

    public static void main(String[] args){
        System.out.println(testMethod());

    }
}
