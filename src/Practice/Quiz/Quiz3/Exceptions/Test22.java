package Practice.Quiz.Quiz3.Exceptions;

public class Test22 {
    public static void main(String[] args) {
//        try {
//            throw new RuntimeException("Unchecked");
//        } finally {
//            System.out.println("Finally runs");
//        }

      m1();
    }
    public static void m1(){
        try {
            throw new RuntimeException("Unchecked");
        } finally {
            System.out.println("Finally runs");
        }
    }
}
