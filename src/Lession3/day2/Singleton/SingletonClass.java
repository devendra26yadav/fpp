package Lession3.day2.Singleton;

// whenever we want a singleton there must a static method
public  class SingletonClass {

    private static SingletonClass p;

    public SingletonClass(){
        System.out.println("Constructor");
    }
    public static SingletonClass getInstance(){
        if(p==null){
            return new SingletonClass();
        }else{
            return p;
        }
    }

    public static void main(String[] args) {
        System.out.println(SingletonClass.getInstance());

        // useful when we provide license key for antivirus
    }

}
