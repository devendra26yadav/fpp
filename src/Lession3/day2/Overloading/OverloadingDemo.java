package Lession3.day2.Overloading;

public class OverloadingDemo {

    int x=6;
    public OverloadingDemo( int x){
        this.x = x;
    }
    // methods having same argument type with order - not  overloading
    // method having smae argument type but in different order - it is overloading
    // return type will verify at run time
    public int sum(int a,int b){
        return a+b;
    }
    /*
    not valid overloading -  because argument type is same
    public float sum(int c,int d){
        return c+d;
    }
     */
    public float sum(float e , int f){
        return e+f;
    }

    public static void main(String[] args) {
        OverloadingDemo od = new OverloadingDemo(9);
        System.out.println(od.sum(5,8)); // 13
        System.out.println(od.sum(8.9f,3)); // 11.9
    }

}
