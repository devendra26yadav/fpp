package Practice.Mindterm.MindTermOne.Problem3;

public class Product implements SortableItem {
    private final String name;
    private final double price;
    public Product(String name,double price){
        this.name=name;
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return String.format("Product[name=%s, price=%.2f]",getName(),getPrice());
    }
}
