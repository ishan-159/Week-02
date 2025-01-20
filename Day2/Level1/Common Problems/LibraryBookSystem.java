class LibBooks {
    //Attribute
    String title;
    String author;
    int price;
    boolean availability;


    //Parameterized  Constructor
    LibBooks(String title, String author, int price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

//Method to borrow a book.

    public void isAvailable() {

        if (availability == true) {
            System.out.println("The book " + title + " is borrowed.");
            availability = false;
        } else {
            System.out.println("The book " + title + " is not available right now.");
        }
    }
}
public class LibraryBookSystem {
    public static void main(String[] args) {

        // Create Circle objects
        LibBooks book1 = new LibBooks("Gone with the wind", "Margaret Mitchell", 245, true);
        LibBooks book2 = new LibBooks("The catcher in the rye","Robert Burns",233,false);
        //Borrow book
        book1.isAvailable();
        book2.isAvailable();

    }
}