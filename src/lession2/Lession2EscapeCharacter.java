package lession2;

public class Lession2EscapeCharacter {
    public static void main(String[] args) {
        String s = "\\t";
        System.out.println(s);


        boolean b11 = Character.isJavaIdentifierStart('$');
        System.out.println(b11);


        // constant
        final int INTEREST = 5 ; // constant
        // INTEREST = 7 ; // cannot reassign the data

    }
}
