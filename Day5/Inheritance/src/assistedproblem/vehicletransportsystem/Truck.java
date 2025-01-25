package assistedproblem.vehicletransportsystem;

// Subclass: Truck
class Truck extends Vehicle {
    double loadCapacity;

    // Constructor for Truck
    public Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType); // Call the constructor of the superclass
        this.loadCapacity = loadCapacity;
    }

    public void displayInfo() {
        super.displayInfo(); // Call the superclass method
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

