package hybridinheritance.vehiclemanagementsystem;

// Subclass
class ElectricVehicle extends Vehicle {
    int batteryCapacity; // Battery capacity in kWh

    ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed); // Call the superclass constructor
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println("Charging the vehicle. Battery capacity: " + batteryCapacity + " kWh.");
    }

    public void displayDetails() {
        super.displayDetails(); // Call the superclass method
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}


