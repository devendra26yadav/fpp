package Practice.Recursion;

public class SumOfFirstNNumbers {

    public static int i=1,pow=1;

    public static void main(String[] args) {
        int n =5;
        System.out.println("power  = "+power(n));
        System.out.println(gcd(5,5));
        System.out.println(reverseNumber(123,0));
        System.out.println(reverseString("abcdefg",""));
    }

    public static int power(int n){
        if(i>5)
            return pow;
        i++;
        return n* power(n);
    }

    public static int gcd(int n1, int n2){

        int gd = (n1>n2?n2:n1);
        while(n1 % gd != 0 || n2 %gd !=0){
            System.out.println(gd);
            gd -=1;
        }

        return gd;
    }

    public static int reverseNumber(int n, int result){
        if(n==0){
            return result;
        }
        return reverseNumber(n/10,result*10+n%10);
    }


    public static String reverseString(String input, String reverse){
        if(input.length() == reverse.length()){
            return reverse;
        }
        System.out.println(reverse);
        return reverseString(input.substring(0,input.length()-1), reverse+input.substring(input.length()-1) );
    }


}
