package Practice.Overriding.Overriding1;

public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Dev",25);
        Person p2 = new Person("Dev",25);
        System.out.println(p1.equals(p2));
        System.out.println(p1==p2);
    }
}
