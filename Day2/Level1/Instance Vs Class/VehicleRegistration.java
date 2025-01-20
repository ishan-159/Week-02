class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 500.00; // Fixed registration fee for all vehicles

    // Constructor
    public Vehicle(String owner, String type) {
        this.ownerName = owner;
        this.vehicleType = type;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: $" + registrationFee);
    }

    // Class method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}
public class VehicleRegistration{
    public static void main(String[] args) {
        // Creating vehicles
        Vehicle vehicle1 = new Vehicle("Alice", "Car");
        Vehicle vehicle2 = new Vehicle("Bob", "Motorbike");

        // Displaying vehicle details before updating registration fee
        System.out.println("Vehicle 1 Details:");
        vehicle1.displayVehicleDetails();

        System.out.println("\nVehicle 2 Details:");
        vehicle2.displayVehicleDetails();

        // Updating registration fee
        Vehicle.updateRegistrationFee(600.00);

        // Displaying vehicle details after updating registration fee
        System.out.println("\nAfter Updating Registration Fee:");
        System.out.println("Vehicle 1 Details:");
        vehicle1.displayVehicleDetails();

        System.out.println("\nVehicle 2 Details:");
        vehicle2.displayVehicleDetails();
    }
}

