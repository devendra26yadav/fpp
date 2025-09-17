package Practice.Mindterm.MindTermOne;


import java.util.Arrays;
import java.util.Comparator;

 class Product {
    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = (name != null) ? name : "Unknown";
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return name + ": $" + price;
    }
}


class StaticInnerSorter {

    // Static inner class
    public static class PriceComparator implements Comparator<Product> {
        @Override
        public int compare(Product a, Product b) {
            if (a == null || b == null) return 0;
            return Double.compare(b.getPrice(), a.getPrice());
        }
    }

    public void sortByPrice(Product[] products) {
        if (products == null) return;

        Arrays.sort(products, new PriceComparator());
    }
}



public class TestDriver2 {
    public static void main(String[] args) {
        Product[] products = {
                new Product("Camera", 700.00),
                new Product("Headphones", 199.99),
                null,
                new Product("Smartwatch", 250.00),
                new Product("Laptop", 210.00),

        };

        /*
        Using Static inner class
        StaticInnerSorter sorter = new StaticInnerSorter();
        sorter.sortByPrice(products);

         */
        sortByPrice(products);

        for (Product p : products) {
            if (p != null)
                System.out.println(p);
        }
    }
    public static void sortByPrice(Product[] products){
        if(products==null) return;
        Arrays.sort(products,(p1,p2)->{
            if(p1==null && p2==null) return 0;
            if(p1==null) return 1;
            if(p2==null) return -1;
            return Double.compare(p2.getPrice(), p1.getPrice());
        });
    }
}
