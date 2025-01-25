package hybridinheritance.restaurantmanagementsystem;

public class Main {
    public static void main(String[] args) {
        // Create a Chef object
        Chef chef = new Chef("Alice", 101);
        System.out.println("Chef Details");
        chef.displayDetails();
        chef.performDuties();

        System.out.println(" Waiter Details");
        // Create a Waiter object
        Waiter waiter = new Waiter("Bob", 102);
        waiter.displayDetails();
        waiter.performDuties();
    }
}
