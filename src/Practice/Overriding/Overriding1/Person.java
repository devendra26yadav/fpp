package Practice.Overriding.Overriding1;

public class Person {
    private final String name;
    private final int age ;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    @Override
    public boolean equals(Object obj){
        System.out.println(Person.class);
        System.out.println(getClass());
        if(this==obj) return true;

        if(obj==null || getClass()!=obj.getClass()) return false;
        Person p = (Person) obj;
        return this.age==p.age && this.name.equals(p.name);
    }
}
