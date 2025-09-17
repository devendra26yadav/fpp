package Practice.Inner.LocalInnerClass;


public class LocalInnerClass {
    static int count=34;
    int y=90;

    void display(){
        int l=8;
        int finalL = l;
        class InnerLocal{
            static int x=10;
            int j = 20;
            void show(){
                System.out.println("From Method show()");
                System.out.println("Var  l = "+ finalL);
            }
        }
        l = l+9;
        InnerLocal obj = new InnerLocal();
        obj.show();
        System.out.println(" Var local l = "+l);
    }

    public static void main(String[] args) {
        LocalInnerClass o = new LocalInnerClass();
        o.display();

    }
}
