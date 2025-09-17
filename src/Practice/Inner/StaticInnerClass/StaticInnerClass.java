package Practice.Inner.StaticInnerClass;

class Outer{
    static int outerStaticVar = 100;
    int outerInstanceVar = 10;

    static class StaticInner{
        static int innerStaticVar = 50;
        int innerInstanceVar = 25;
        static void innerStaticMethod(){
            System.out.println("************************************************");
            System.out.println("Inner Static Method");
            System.out.println("Outer Static Var : "+outerStaticVar);
            Outer o = new Outer();
            System.out.println("Outer Instance Var : "+o.outerInstanceVar);
            StaticInner s = new StaticInner();
            System.out.println(s.innerInstanceVar);
            System.out.println("************************************************");
        }
        void innerInstanceMethod(){
            System.out.println("Inner Instance Method");
            Outer obj = new Outer();
            System.out.println(obj.outerStaticVar);
            System.out.println(outerStaticVar);
            System.out.println("Inner mathod : innerStaticVar = "+innerStaticVar);
            System.out.println(obj.outerInstanceVar);
        }
    }
    // Non-static context
    void outerInstanceMethod(){
        System.out.println("--------------------------------------------------");
        System.out.println("Outer Instance Method");
        //static access is direct
        System.out.println("Inner Static var : "+StaticInner.innerStaticVar);
        StaticInner.innerStaticMethod();
        // Non static access via object
        StaticInner obj = new StaticInner();
        System.out.println("Inner Instance Var : "+obj.innerInstanceVar);
        obj.innerInstanceMethod();
        System.out.println("--------------------------------------------------");
    }

    //static context
    static void outerStaticMethod(){
        System.out.println("--------------------------------------------------");
        System.out.println("Outer Static Method");
        System.out.println("Inner Static Var : "+StaticInner.innerStaticVar);
        StaticInner.innerStaticMethod();
        StaticInner obj = new StaticInner();
        System.out.println("Inner Instance Var : "+obj.innerInstanceVar);
        //System.out.println(obj.innerStaticVar); valid
        obj.innerInstanceMethod();
        System.out.println("--------------------------------------------------");
    }
}
public class StaticInnerClass {
    public static void main(String[] args) {
        new Outer().outerInstanceMethod();
        Outer.outerStaticMethod();

    }
}