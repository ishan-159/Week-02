package hybridinheritance.restaurantmanagementsystem;


class Waiter extends Person implements Worker {

    Waiter(String name, int id) {
        super(name, id); // Call the superclass constructor
    }

    // Implement the performDuties method
    public void performDuties() {
        System.out.println("Duties: Serves food and takes orders from customers.");
    }
}

