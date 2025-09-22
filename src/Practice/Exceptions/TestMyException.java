package Practice.Exceptions;

import Practice.Mindterm.MindTermOne.Problem3.SortableItem;

public class TestMyException {
    public static void main(String[] args) {

        try
        {
            int age=19;
            validateAge(age);

        } catch (MyException e) {
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Method 1");
        }

        try{
            divideBy(3,0);

        }catch (MyException e){
            System.out.println(e.getMessage());
        }

    }
    public static void validateAge(int age) throws MyException{
        if(age<18){
            throw new MyException("Age Must be more than 18");
        }
        System.out.println("Valid Age : "+age);

    }
    public static void divideBy(int a, int b) throws MyException{
        if(b==0){
            throw new MyException("Denominator can not be zeo");
        }
        System.out.println(a/b);
    }
}
