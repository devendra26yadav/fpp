package Practice.Quiz.QuizOne;

public class FloatingPoint {

    public static void main(String[] args) {

        int i= 'A';
        System.out.println(i);

        float f1 = 3.4f;
        float f2 = 3.4f;
        float f3 = 3.0f + 0.4f;
        float f4 = f1*f3;
        float f5 = 11.56F;
        System.out.println(f1==f2);
        System.out.println(f1==f3);
        System.out.println(f2==f3);
        System.out.println(f4==f5);

        float x = 2.3456f;
        float y = 5.4193f;
        double x1 = 2.3456;
        double y1 = 5.4193;
        double k1 = x*y;
        double k2 = x1*y1;
        System.out.println(k1);
        System.out.println(k2);

        double a= 0.7;
        double b = 0.9;
        double s1 = a + 0.1;
        double s2 = b - 0.1;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
    }
}
