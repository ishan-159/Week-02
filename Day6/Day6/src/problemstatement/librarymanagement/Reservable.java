package problemstatement.librarymanagement;

// Reservable.java (Interface)
public interface Reservable {
    void reserveItem(String borrower);
    boolean checkAvailability();
}
