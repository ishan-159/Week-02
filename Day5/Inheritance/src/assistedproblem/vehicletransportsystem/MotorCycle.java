package assistedproblem.vehicletransportsystem;

// Subclass: Motorcycle
class Motorcycle extends Vehicle {
    boolean hasSideCar;

    // Constructor for Motorcycle
    public Motorcycle(int maxSpeed, String fuelType, boolean hasSideCar) {
        super(maxSpeed, fuelType); // Call the constructor of the superclass
        this.hasSideCar = hasSideCar;
    }

    public void displayInfo() {
        super.displayInfo(); // Call the superclass method
        System.out.println("Has Sidecar: " + (hasSideCar ? "Yes" : "No"));
    }
}

