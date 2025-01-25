package assistedproblem.vehicletransportsystem;

// Subclass
class Car extends Vehicle {
    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType); // Call the constructor of the superclass
        this.seatCapacity = seatCapacity;
    }

    public void displayInfo() {
        super.displayInfo(); // Call the superclass method
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

