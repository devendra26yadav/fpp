package Assignments.Assignment8.lesson11.Prob3;

import java.util.Objects;

class Book {
    private String ISBN;
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (!(o instanceof Book)) return false;
        Book b = (Book) o;
        return Objects.equals(ISBN, b.ISBN) && Objects.equals(title, b.title) && Objects.equals(author, b.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN, title, author);
    }

    @Override
    public String toString() {
        return String.format("Book{ISBN='%s', title='%s', author='%s', isBorrowed=%s}",ISBN,title,author,isBorrowed);
    }
}
