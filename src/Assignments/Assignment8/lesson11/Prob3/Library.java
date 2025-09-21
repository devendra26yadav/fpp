package Assignments.Assignment8.lesson11.Prob3;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class Library {
    private final HashMap<String, Book> books;

    private Library() {
        books = new HashMap<>();
    }

    public static Library createLibrary() {
        return new Library();
    }

    public void addBook(String ISBN, String title, String author) {

        if (ISBN != null && !books.containsKey(ISBN)) {
            books.put(ISBN, new Book(ISBN, title, author));
            System.out.printf("\nISBN: %s, Added in the library.", ISBN);
        } else {
            System.out.println("\nAlready Existed");
        }
    }

    public void borrowBook(String ISBN) {
        if (ISBN == null){
            System.out.println("Please check the ISBN");
            return;
        }
        if (books.containsKey(ISBN)) {
            if (!books.get(ISBN).isBorrowed()) {
                books.get(ISBN).setBorrowed(true);
                System.out.printf("\n%s, Borrow Succeeded", ISBN);
            } else {
                System.out.printf("\n%s, Already borrowed", ISBN);
            }
        } else {
            System.out.printf("\nISBN : %s, Not Found\n", ISBN);
        }

    }

    public void returnBook(String ISBN) {
        if (ISBN == null) return;
        if (books.containsKey(ISBN) && books.get(ISBN).isBorrowed()) {
            books.get(ISBN).setBorrowed(false);
            System.out.printf("\nISBN : %s, Is Returned Successfully.", ISBN);
        } else if (books.containsKey(ISBN)) {
            System.out.printf("\n%s, Was not borrowed.", ISBN);
        } else {
            System.out.printf("\nISBN : %s, Not Found\n", ISBN);
        }
    }

    public boolean isBookBorrowed(String ISBN) {
        if (ISBN == null) return false;
        return books.containsKey(ISBN) && books.get(ISBN).isBorrowed();
    }

    public Book getBookDetails(String ISBN) {
        if (ISBN == null) return null;
        return books.getOrDefault(ISBN, null);
    }

    public void listAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No Book Found\n");
            return;
        }
        for (String key : books.keySet()) {
            Book book = books.get(key);
            System.out.println(book);
        }
    }

    public void listBorrowedBooks() {

        if (books.isEmpty()) return;
        List<Book> borrowedBooks = new ArrayList<>();
        for (Book book : books.values()) {
            if (book.isBorrowed()) {
                borrowedBooks.add(book);
            }
        }

        if (borrowedBooks.isEmpty()) {
            System.out.println("No borrowed books.");
        } else {
            borrowedBooks.sort(Comparator.comparing(Book::getISBN));
            System.out.println("Borrowed Books ");
            for (Book b : borrowedBooks) {
                System.out.println(b);
            }
        }
    }

}
