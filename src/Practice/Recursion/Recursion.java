package Practice.Recursion;

public class Recursion {

    // Reverse a number
    public static void reverseNumber(int num){
        System.out.printf("\nThe reverse of %d = %d",num,reverseNumberHelper(num,0));
    }
    private static int reverseNumberHelper(int num,int result){
        if(num==0){
            return result;
        }
        return reverseNumberHelper(num/10,10*result+num%10);
    }

    //Count digits in a number
    public static void countDigits(int num){
        System.out.printf("\nNumber of digits in %d = %d",num,countDigitsHelper(num,0));
    }
    private static int countDigitsHelper(int num,int count){
        if(num==0){
            return count;
        }
        return countDigitsHelper(num/10,count+1);
    }

    // sum of digits of a number
    public static void digitSum(int num){
        System.out.printf("\nDigits Sum of %d = %d",num,digitsSumHelper(num,0));
    }
    private static int digitsSumHelper(int num,int sums){
        if(num==0){
            return sums;
        }
        return digitsSumHelper(num/10,sums+num%10);
    }
    //Product of digits of a number
    public static void digitProduct(int num){
        System.out.printf("\nProduct of all digits of %d = %d",num,digitsProductHelper(num,1));
    }
    private static int digitsProductHelper(int num,int product){
        if(num==0){
            return product;
        }
        return digitsProductHelper(num/10,product*(num%10));
    }
    //Greatest Common Divisor (GCD) using recursion
    public static void findGCD(int num1,int num2){

    }
//    private static int findGCDHelper(int num1,int num2){
//        ret
//    }
    // count vowels
    public static void countVowels(String input){
        int count = countVowelsHelper(input.toLowerCase(),0);
        System.out.println("\nVowels count : "+count);
    }
    private static int countVowelsHelper(String input,int index){
        if(index==input.length()){
            return 0;
        }
        char c = input.charAt(index);
       if("aeiou".indexOf(c)!=-1){
           return 1+countVowelsHelper(input,index+1);
       }
        return countVowelsHelper(input,index+1);
    }
    // reversing string
    public static void reverseString(String input){
        String result= reverseStringHelper(input,input.length()-1);
        System.out.println(result);
    }
    private static String reverseStringHelper(String input,int i){
        if(i<0){
            return "";
        }

       return input.charAt(i)+ reverseStringHelper(input,i-1);
    }
    // factorial
    public static void factorial(long n){
        System.out.print("Factorial of "+n+" = ");
        System.out.println(factorialHelper(n));
    }
    private static long factorialHelper(long n){
        if(n==0)return 1;
        return n*factorialHelper(n-1);
    }

    // sum of digits
    public static void sumOfDigits(int n){
        System.out.println("Sum of digits of "+n+" = "+sumOfDigitsHelper(Math.abs(n)));
    }
    private static int sumOfDigitsHelper(int n){
        if(n==0){
            return 0;
        }
        return n%10 + sumOfDigitsHelper(n/10);
    }

    // count 7
    public static void count7(int n){
        System.out.printf("Total 7 count in %d = %d",n,count7Helper(Math.abs(n)));
    }
    private static int count7Helper(int n){
        if(n==0) return 0;
        if(n%10==7){
            return 1+ count7Helper(n/10);
        }
        return count7Helper(n/10);
    }
    // contains element;
    public static void containsElement(int[] arr,int target){
        System.out.println("\nContains : "+containsElementHelper(arr,target,0));
    }
    private static boolean containsElementHelper(int[] arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        if(arr[index]==target){
            return true;
        }
        return containsElementHelper(arr,target,index+1);

    }
    // count even
    public static void countEvenElement(int[]arr){
        System.out.println("\nTotal even : "+countEvenElementHelper(arr,0));
    }
    private static int countEvenElementHelper(int[]arr,int i){
        if(i==arr.length){
            return 0;
        }
        if(arr[i]%2==0){
            return 1+countEvenElementHelper(arr,i+1);
        }
        return countEvenElementHelper(arr,i+1);
    }
    //sum array
    public static void sumArray(int[]arr){
        System.out.println("\nArray Sum : "+sumArrayHelper(arr,0));
    }
    private static int sumArrayHelper(int[]arr,int i){
        if(i==arr.length){
            return 0;
        }
        return arr[i] + sumArrayHelper(arr,i+1);
    }
}
