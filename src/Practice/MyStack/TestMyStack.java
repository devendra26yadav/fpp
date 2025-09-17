package Practice.MyStack;

public class TestMyStack {
    public static void main(String[] args) {
        MyCustomStack<Book> books = new MyCustomStack<>();
        books.push(new Book("AI",45.70));
        books.push(new Book("Java",200.45));
        System.out.println(books);
        System.out.println("size of books : "+books.size());
    }
}
