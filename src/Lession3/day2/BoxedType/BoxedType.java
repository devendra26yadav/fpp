package Lession3.day2.BoxedType;

public class BoxedType {
    // Instance - Default values

    int a;
    float f;
    String str;
    char c;
    public static void main(String[] args) {

        // Local variable must be initialize before use
        int x ;
        Integer x1 ; // object boxed primitive / wrapper

        x = 20;
        x1= null;
        System.out.println(x1);
      //  System.out.println(x1.toString()); // null pointer exception
        System.out.println(x);

        // Access a, you need object
        // Print the default values

        BoxedType b = new BoxedType();
        System.out.println(b.a);

        String num = "87";
        System.out.println(Integer.valueOf(num));
        String num2 = "46s";
       // System.out.println(Integer.parseInt(num2)); // NumberFormatException: For input string: "46s"

    }
}
