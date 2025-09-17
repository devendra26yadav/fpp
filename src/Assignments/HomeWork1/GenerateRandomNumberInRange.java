package Assignments.HomeWork1;

public class GenerateRandomNumberInRange {

    public static int getRandomInRangeOf(int start, int bound ){
        if(start>bound){
            throw new IndexOutOfBoundsException("Range Does not satisfy rules");
        }
        int rangeLength = bound-start;
        double ret;
        double flag = Math.random();
        ret = start+ rangeLength*flag;
//        if((int)ret==bound)
//            ret= (double) (start + bound) /2;

        ret = ((int)ret==bound)? (double) (start + bound) /2:ret;

        System.out.printf("Random Number between "+start+" and "+bound +" = ");
        return (int)ret;
    }

    public static void main(String[] args) {
        System.out.println(getRandomInRangeOf(-100,-12));
        System.out.println(getRandomInRangeOf(12,45));
        System.out.println(getRandomInRangeOf(1000,2000));
        System.out.println(getRandomInRangeOf(-200,0));
    }
}

/*

Sample Output:

Random Number between -100 and -12 = -46
Random Number between 12 and 45 = 24
Random Number between 1000 and 2000 = 1785
Random Number between -200 and 0 = -34


 */