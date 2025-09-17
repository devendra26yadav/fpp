package Lession6.innerclass;

public class MyStaticOuter {
    private int a = 50;
    private String s = " Java";
    private static int k = 70;
    public MyStaticOuter(){
        System.out.println("My Outer Static");
    }

    // inner static class
    // Static inner class can access
    public static class MyStaticInner{
        private int y =50;
        private static  String S1 = "HTML";
        public MyStaticInner(){
            System.out.println("Inner Static Class");
        }
        // Non -static method - Instance method it can access instance fiels of inner class only
        public  void test(){
            System.out.println("Testing");
           // System.out.println("s = "+s); // Non static
            System.out.println("K = "+k); // can access static
            System.out.println("y = "+y);// can access inner instance fields
        }
        public static void m1(){
            System.out.println("from static method m()");
           // System.out.println("a = "+a); // a is non static
            System.out.println("K = "+k); // can access static
           // System.out.println("y = "+y); // static method fields (inner/outer)

        }
    }
}
