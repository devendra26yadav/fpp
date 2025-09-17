package Lession6.innerclass;

// Outer class is Enclosing class
// Byte code MyClass.class
public class MyClass {
    // member inner class
    private int a = 50;
    private String s = " Hello";
    private String name="Java";

    // if we want to access inner class methods/fields of object inner class  needed
    //Byte code MyClass$Inner.class
    private Inner ob;
    public MyClass(){
        System.out.println("Outer class");
        ob = new Inner();
        ob.display();
        System.out.println("From Outer accessing inner k = "+ob.k);
    }


    // inner class or nested class or member inner class
    // inner can come with four type of modifier protected, default, public, private
    // inner class can access all outer class fields even private directly

    // if our class is public then
//    private class Inner{
//        private int k = 50;
//        private String lang = "C++";
//        private String name="Python";
//
//        private Inner(){
//            System.out.println("Inner class");
//
//        }

    // for public inner class
    public class Inner{
        private int k = 50;
        private String lang = "C++";
        private String name="Python";

        public Inner(){
            System.out.println("Inner class");

        }
        public void display(){
            System.out.println("Outer a : "+a);
            System.out.println("Outer s : "+s);
            System.out.println("Inner k : "+k);
            System.out.println("Inner lang : "+lang);
            // if we want to access outer class fields/ methods we use like
            System.out.println("Outer name :"+MyClass.this.name);
            System.out.println("Inner name :"+this.name);
        }
    }
}
