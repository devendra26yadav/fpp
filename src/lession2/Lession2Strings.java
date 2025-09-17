package lession2;

public class Lession2Strings {
    public static void main(String[] args) {
        // string pool memory - part of heap
        String s1 = "Java";
        String s3 = "Java";

        String s2 = new String("HTML is fun");
        String s4 = new String("HTML is fun");
        System.out.println(s1.hashCode()+" "+s3.hashCode());
        System.out.println(s2.hashCode()+" "+s4.hashCode());
        System.out.println(System.identityHashCode(s2)+" "+System.identityHashCode(s4));

    }
}
