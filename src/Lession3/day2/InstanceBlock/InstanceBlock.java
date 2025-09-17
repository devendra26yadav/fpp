package Lession3.day2.InstanceBlock;
// it is used whenever we want common code for the object,
// but it will be executed before constructor will execute

public class InstanceBlock {

    {
        System.out.println("Not crying");
    }

    public  InstanceBlock(){
        System.out.println("cons");
    }
    // instance block will execute first - before constructor
    {
        System.out.println("baby crying");
    }
    static {
        System.out.println("Static Block");
    }

    {
        System.out.println("we are happy");
    }

    public static void main(String[] args) {
        InstanceBlock ib = new InstanceBlock();
        new InstanceBlock();

    }
}
/*
Output:

Static Block
Not crying
baby crying
we are happy
cons
Not crying
baby crying
we are happy
cons

 */