import java.util.ArrayList;

// Book class
class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayBook() {
        System.out.println("Book: " + title + ", Author: " + author);
    }
}

// Library class with aggregation of Book objects
class Library {
    ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void showBooks() {
        System.out.println("Books in library:");
        for (Book book : books) {
            book.displayBook();
        }
    }
}

// Demonstration
public class AggregationDemo {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "Author A");
        Book b2 = new Book("Data Structures", "Author B");

        Library lib1 = new Library();
        Library lib2 = new Library();

        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2);

        lib1.showBooks();
        lib2.showBooks();

        // Books exist independently from libraries
        b1.displayBook();
    }
}
