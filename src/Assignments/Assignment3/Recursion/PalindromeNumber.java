package Assignments.Assignment3.Recursion;

public class PalindromeNumber {

    public static boolean isPalindrome(int num) {
        return num == reverseNumber(num, 0);
    }

    private static int reverseNumber(int num, int flag) {
        if (num == 0) {
            return flag;
        }
        return reverseNumber(num / 10, flag * 10 + num % 10);
    }
}
