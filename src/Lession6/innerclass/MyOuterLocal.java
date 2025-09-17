package Lession6.innerclass;

public class MyOuterLocal {
    private int a = 50;
    private String s1 = "Dev";

    public void display(int x){
        // Local inner class always inside a method
        // local inner class can only be access inside that method irrespective of access modifier

        // but i can change here x = x + 100;
        System.out.println(x);

        int y = 90;
        class Local{
            private int z = 100;
            private String s = "Java";
            public void test(){
                System.out.println("Testing");
                System.out.println(a);
                System.out.println(s1);
                //y = y+90;// not allowed for all local variables
                System.out.println(x);
                z = 200;
                s = s+ "yadav";
                // but ca not modify
               // x = x+ 100; // compiler assumes as effectively final
                // Effectively final - not necessary declare as final ,
                // but assumed as effectively final and not modify status - JDK8
            }
        }
        Local o = new Local();
    }
}
