package lession2;

import java.util.Scanner;

public class Lession2CountCharacterInString {

    public static void main(String[] args) {
        String s ="The quick brown fox jumps over the lazy dog";
        System.out.println(s);
        System.out.println("Enter any character to count in the above string ");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                count++;
            }
    }
        sc.close();
        System.out.println(c +" occured "+count+" times in "+s);

    }
}
