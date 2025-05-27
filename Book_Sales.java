package program4;
// Book_Sales.java
public class Book_Sales {
    // Attributes
    String saler_name;
    int no_of_sales;
    int saler_id;

    // Constructor to initialize all values
    public Book_Sales(String name, int sales, int id) {
        saler_name = name;
        no_of_sales = sales;
        saler_id = id;
    }

    // Method to display sales details
    public void displaySalesDetails() {
        System.out.println("Saler Name: " + saler_name);
        System.out.println("Number of Sales: " + no_of_sales);
        System.out.println("Saler ID: " + saler_id);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a Book_Sales object
        Book_Sales sales1 = new Book_Sales("Ravi Kumar", 120, 101);

        // Displaying sales details
        sales1.displaySalesDetails();
    }
}