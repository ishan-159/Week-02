package hybridinheritance.vehiclemanagementsystem;

public class Main {
    public static void main(String[] args) {
        // Create an ElectricVehicle object
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200, 75);
        System.out.println("Electric Vehicle Details");
        ev.displayDetails();
        ev.charge();

        System.out.println("Petrol Vehicle Details");
        // Create a PetrolVehicle object
        PetrolVehicle pv = new PetrolVehicle("Toyota Corolla", 180, 50);
        pv.displayDetails();
        pv.refuel();
    }
}
