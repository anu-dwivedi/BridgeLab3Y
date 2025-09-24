// Superclass: Book
class Book {
    String title;
    int publicationYear;

    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Subclass: Author extends Book
class Author extends Book {
    String name;
    String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}

// Main class to test
public class LibraryTest {
    public static void main(String[] args) {
        Author authorBook = new Author("Effective Java", 2018, "Joshua Bloch", "Author of several Java programming books.");
        authorBook.displayInfo();
    }
}