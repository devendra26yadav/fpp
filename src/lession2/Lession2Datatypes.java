package lession2;

public class Lession2Datatypes {
    public static void main(String[] args) {
//        Primitive data types
        float x = 2.3456f;
        float y = 5.4193f;
        double x1 = 2.3456;
        double y1 = 5.4193;
        System.out.println("x*y = " + x*y);
        System.out.println("x1*y1 = " + x1*y1);


//        for double
        System.out.println("For Double and float");
        double a= 0.7;
        double b = 0.9;
        double s1 = a + 0.1; // 0.8
        double s2 = b - 0.1; // 0.8
        System.out.println("s1 = "+ s1);
        System.out.println("s2 = "+ s2);
        System.out.println(s1==s2);//false , issue is with precision
// fix the precision issue BigDecimial (Object) , use equals()
        int a11 = 50;
        int a22 = 50;
        System.out.println(a11==a22);

//        char type
        char ch = 'A';
        char ch1 = 65;
        System.out.println(ch +" "+ch1);
//        ASCII
        char ch2 = '\u0041'; // using hex value
        System.out.println(ch2);
//        supplementry character - one char formed using two unicodes


    }
}
