package Practice.Mindterm.MindTermOne.Problem3;

import java.util.Arrays;

public class TestDriver {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        inv.addProduct(new Product("Chair", 49.99));
        inv.addProduct(new Product("Table", 129.99));
        inv.addProduct(new Product("Lamp", 19.99));
        inv.addProduct(new Product("Torch", 20.0));
        inv.printSortedPriceByAnonymousClas();
        System.out.println("--------------------------------");
        System.out.println("Using Local class to sort");
        inv.printSortedPriceByLocalClass();

        System.out.println("Using Lambda ");
        inv.printSortedPriceByLambda();
        System.out.println("Arrays ______________________________________________");
        SortableItem[] items = {
                new Product("Chair", 49.99),
                new Product("Table", 129.99),
                new Product("Lamp", 19.99),
                null,
                new Product("Torch", 20.0)
        };

        printSorted(items);
    }
    public static void printSorted(SortableItem[] items){
        Arrays.sort(items,(i1,i2)->{
            if(i1==null && i2==null) return 0;
            if(i1==null) return 1;
            if(i2==null) return -1;
           return Double.compare(i1.getPrice(),i2.getPrice());
        });
        for(SortableItem item:items){
//            if(item!=null){
                System.out.println(item);
//            }
        }
    }
}
