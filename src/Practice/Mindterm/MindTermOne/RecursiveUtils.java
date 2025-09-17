package Practice.Mindterm.MindTermOne;

public class RecursiveUtils {

    public static void main(String[] args) {
        System.out.println(isCleanPalindrome("A man, a plan, a canal, Panama")); // true
        System.out.println(isCleanPalindrome("RaceCar"));                        // true
        System.out.println(isCleanPalindrome("No 'x' in Nixon"));                // true
        System.out.println(isCleanPalindrome("Was it a car or a cat I saw?"));   // true
        System.out.println(isCleanPalindrome("Hello"));                          // false
        System.out.println(isCleanPalindrome("123321"));                         // false (only digits)

    }

    // Returns true if input is a palindrome (ignores case and non-letters)
    public static boolean isCleanPalindrome(String input){
        int start =0;
        int end = input.length()-1;
        input=input.toLowerCase();
        return helper(input,start,end);
    }
    private static boolean helper(String input,int start, int end) {
        // Implement this recursively
        if(start>=end) return true;

        char startChar = input.charAt(start);
        char endChar = input.charAt(end);

        if(!Character.isLetter(startChar)){
            return helper(input,start+1,end);
        }
        if(!Character.isLetter(endChar)){
            return helper(input,start,end-1);
        }
        if(startChar!=endChar){
            return false;
        }
        return helper(input,start+1,end-1);
    }
}
