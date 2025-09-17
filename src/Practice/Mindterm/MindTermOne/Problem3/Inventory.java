package Practice.Mindterm.MindTermOne.Problem3;

import java.util.*;

public class Inventory {
    List<Product> products = new ArrayList<>();
    public void addProduct(Product p){
        products.add(p);
    }
    public void printSortedPriceByAnonymousClas(){
        products.sort(new Comparator<Product>(){
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o1.getPrice(), o2.getPrice());
            }
        });
        for(Product p: products){
            System.out.println(p);
        }
    }
    public void printSortedPriceByLocalClass(){

        class LocalClassSort implements Comparator<Product>{
            @Override
            public int compare(Product p1,Product p2){
                return Double.compare(p2.getPrice(),p1.getPrice());
            }
        }
        // this will works fine
        products.sort(new LocalClassSort());

        // this will work for all types
//        Collections.sort(products,new LocalClassSort());
        for(Product p: products){
            System.out.println(p);
        }
    }
    public void printSortedPriceByLambda(){

        products.sort((p1,p2)-> Double.compare(p1.getPrice(),p2.getPrice()));
//        products.sort(Comparator.comparingDouble(Product::getPrice));
        printProducts();

    }
    private void printProducts(){
        for(Product p:products){
            System.out.println(p);
        }
    }

}
