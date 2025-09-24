package Practice.Quiz.Quiz3.Exceptions;

public class Test21 {
    public static void main(String[] args){
        try {
            Class.forName("NoSuchClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
        // try removing comment of the below code
       // Class.forName("NoAnyClass");
    }

}
