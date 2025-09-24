public class Book2 {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Default constructor
    public Book2() {
        this("Untitled", "Unknown Author", 0.0, true);
    }

    // Parameterized constructor
    public Book2(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to borrow the book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You've borrowed \"" + title + "\" by " + author + ".");
        } else {
            System.out.println("Sorry, \"" + title + "\" is currently unavailable.");
        }
    }

    // Display book details
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    // Example usage
    public static void main(String[] args) {
        Book2 book = new Book2("The Psychology of Money", "Morgan Housel", 499.00, true);
        book.displayInfo();
        book.borrowBook();
        book.borrowBook(); // Attempt to borrow again
    }
}


