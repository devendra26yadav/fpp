package lession2;

public class Lession2ConditionalOperator {
    public static void main(String[] args) {

        //comapre 3 numbers


        System.out.println(findGreatest(7,9,3));
    }
    public static int findGreatest(int num1,int num2, int num3){
        int grreatest = (num1>num2&&num1>num3)?num1:(num2>num3&&num2>num1)?num2:num3;
        return  grreatest;
    }
}
