package Practice.Inner.RegularInnerClass;

public class TestOuterClass {

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.Inner inner = outer.new Inner();
        inner.display();
    }
}
