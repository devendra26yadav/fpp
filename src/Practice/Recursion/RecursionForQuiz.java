package Practice.Recursion;

public class RecursionForQuiz {
    public static void main(String[] args) {
        // printUp(3);
      //  System.out.println();
       // System.out.println(oddSum(11));
        System.out.println("Power : "+powerOf(3,3)); //4335951469400386777
        System.out.println(countDigits(45345,1));
        System.out.println(sumOfDigits(345,0));
        System.out.println(productOfDigits(345,1));
    }

    static void printUp(int n) {
        if (n <= 0) return;
        printUp(n - 1);
        System.out.print(n + " ");
    }

    static int oddSum(int n) {
        if (n == 0) return 0;
        int temp = 0;
        if (n % 2 != 0) {
            temp = n;
        }
        return temp + oddSum(n - 1);
    }
    static int powerOf(int number,int index){
        if(index<=1)
        {
            return number;
        }
        return number*powerOf(number,index-1);
    }

    static int countDigits(int n, int result){

        if(n==0){
            return result;
        }

        return countDigits(n/10,result+1);
    }
    static int sumOfDigits(int n, int result){

        if(n==0){
            return result;
        }

        return sumOfDigits(n/10,n%10+result);
    }
    static int productOfDigits(int n, int result){

        if(n==0){
            return result;
        }

        return productOfDigits(n/10,n%10*result);
    }



}
