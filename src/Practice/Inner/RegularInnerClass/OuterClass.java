package Practice.Inner.RegularInnerClass;

public class OuterClass {
    private String name ="Dev";

    class Inner{
         void display(){
            System.out.println("Outer name : "+name);
        }
    }
}
