package hybridinheritance.vehiclemanagementsystem;


// Subclass: PetrolVehicle
class PetrolVehicle extends Vehicle implements Refuelable {
    double fuelTankCapacity; // Fuel tank capacity in liters

    PetrolVehicle(String model, int maxSpeed, double fuelTankCapacity) {
        super(model, maxSpeed); // Call the superclass constructor
        this.fuelTankCapacity = fuelTankCapacity;
    }

    // Implement the refuel method from Refuelable interface
    public void refuel() {
        System.out.println("Refueling the vehicle. Fuel tank capacity: " + fuelTankCapacity + " liters.");
    }

    public void displayDetails() {
        super.displayDetails(); // Call the superclass method
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
    }
}


