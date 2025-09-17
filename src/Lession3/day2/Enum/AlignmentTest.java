package Lession3.day2.Enum;

public class AlignmentTest {
    public static void main(String[] args) {
        System.out.println(Alignment.LEFT);
        System.out.println(Alignment.RIGHT);

        // currency
        System.out.println(Currency.US);
        System.out.println(Currency.valueOf("INDIA"));
//        System.out.println(Currency.valueOf("RUSSIA"));
        if(Currency.US==Currency.valueOf("US")){
            System.out.println("Matched");
            System.out.println(Currency.INDIA.ordinal());
        }else{
            System.out.println("Does not match");
        }
    }
}
