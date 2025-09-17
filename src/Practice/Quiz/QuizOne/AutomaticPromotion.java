package Practice.Quiz.QuizOne;

public class AutomaticPromotion {
    public static void main(String[] args) {
        byte b = 3;
        char s = 'A';
        System.out.println(b+s);//68
        System.out.println(((Object)(s+b)).getClass().getName()); // java.lang.Integer
    }
}
