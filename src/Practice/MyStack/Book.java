package Practice.MyStack;

public class Book {
    private final String title;
    private final double cost;
    public Book(String title,double cost){
        this.title=title;
        this.cost=cost;
    }
    @Override
    public String toString(){
        return "Book{ title : "+title+", cost : "+cost+" }";
    }
}
