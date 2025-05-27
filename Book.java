package program4;
// Book.java
public class Book {
    // Attributes
    String bookname;
    String author;
    String publisher;
    double price;
    int year;

    // Constructor to initialize all values
    public Book(String bookname, String author, String publisher, double price, int year) {
        this.bookname = bookname;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.year = year;
    }

    // Method to display book details
    public void display() {
        System.out.println("Book Name: " + bookname);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Price: ₹" + price);
        System.out.println("Year of Publication: " + year);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a Book object
        Book book1 = new Book("The Alchemist", "Paulo Coelho", "HarperCollins", 499.00, 1988);

        // Displaying book details
        book1.display();
    }
}