package hybridinheritance.restaurantmanagementsystem;


class Chef extends Person implements Worker {

    Chef(String name, int id) {
        super(name, id); // Call the superclass constructor
    }

    public void performDuties() {
        System.out.println("Duties: Prepares meals and manages the kitchen.");
    }
}


