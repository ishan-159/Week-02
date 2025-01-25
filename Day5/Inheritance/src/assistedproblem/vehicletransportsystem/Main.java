package assistedproblem.vehicletransportsystem;

public class Main {
    public static void main(String[] args) {
        // Create objects of each subclass
        Car car = new Car(200, "Petrol", 5);
        Truck truck = new Truck(120, "Diesel", 10.5);
        Motorcycle motorcycle = new Motorcycle(180, "Petrol", false);

        // Store all vehicles in an array of Vehicle type
        Vehicle[] vehicles = {car, truck, motorcycle};

        // Demonstrate polymorphism
        System.out.println("Vehicle Details");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
            System.out.println();
        }
    }

}
