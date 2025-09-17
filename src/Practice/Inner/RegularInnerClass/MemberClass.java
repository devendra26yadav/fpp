package Practice.Inner.RegularInnerClass;

class Outer {
    int x = 100;

    class Inner {
        private int x = 200;
        private int y=10;
        private static int z =12;
        static int RATE =45;
        protected static int COST = 78;
        public static int SHAPE_VALUE=90;
        public Inner(){
            x=8;
        }
        void show(int x) {
            System.out.println("Local x = " + x);        // parameter
            System.out.println("Inner x = " + this.x);   // inner class var
            System.out.println("Outer x = " + Outer.this.x); // outer var
            Outer.this.x=x+9;
            System.out.println("Outer after ( Outer.this.x=x+9 ) x = " + Outer.this.x); // outer var
            x=x+9;
            System.out.println("Local modified with ( x = x + 9 ) : "+x);
            System.out.println("Y = "+y);
            System.out.println("Static field Z = "+z);
        }
        static void show2(){
            System.out.println("Static method");

            //System.out.println("From Static method Y : "+y);// can not be accessed
        }
    }
}

public class MemberClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.show(300);
        Outer.Inner.show2();
        System.out.println(Outer.Inner.RATE);
        System.out.println(Outer.Inner.COST);
        System.out.println(Outer.Inner.SHAPE_VALUE);
    }
}
