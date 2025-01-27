package problemstatement.librarymanagement;

// Main.java (Demo Class)
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LibraryItem> libraryItems = new ArrayList<>();

        libraryItems.add(new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald"));
        libraryItems.add(new Magazine("M001", "National Geographic", "Various Authors"));
        libraryItems.add(new DVD("D001", "Inception", "Christopher Nolan"));

        for (LibraryItem item : libraryItems) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                System.out.println("Available: " + reservable.checkAvailability());
                reservable.reserveItem("John Doe");
                System.out.println("Available after reservation: " + reservable.checkAvailability());
            }

            System.out.println("-----------------------");
        }
    }
}
