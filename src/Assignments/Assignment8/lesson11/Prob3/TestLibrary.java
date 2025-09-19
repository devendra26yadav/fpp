package Assignments.Assignment8.lesson11.Prob3;

public class TestLibrary {
    public static void main(String[] args) {
        Library library = getLibrary();

        System.out.println("\nBorrowing Book");
        library.borrowBook("6789012345");
        library.borrowBook("6789012345");
        library.borrowBook("5647382910");
        System.out.print("\nDetails : " + library.getBookDetails("6789012345"));
        library.borrowBook("6789012395");
        System.out.println("Is Borrowed : "+library.isBookBorrowed("6789012345"));

        System.out.println("Listing All Available Books");
        library.listAllBooks();

        library.listBorrowedBooks();
        library.returnBook("6789012345");

    }

    private static Library getLibrary() {
        Library library = Library.createLibrary();
        library.addBook("9876543210", "Effective Java", "Joshua Bloch");
        library.addBook("4567891230", "Clean Code", "Robert C. Martin");
        library.addBook("1029384756", "Design Patterns", "Erich Gamma");
        library.addBook("5647382910", "Java Concurrency in Practice", "Brian Goetz");
        library.addBook("6789012345", "Head First Java", "Kathy Sierra");
        library.addBook("1122334455", "The Pragmatic Programmer", "Andrew Hunt");
        library.addBook("9988776655", "Refactoring", "Martin Fowler");
        library.addBook("5566778899", "Test Driven Development", "Kent Beck");
        return library;
    }
}
