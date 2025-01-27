package problemstatement.ridehailing;

// Main.java (Demo Class)
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("C001", "Alice", 10.0));
        vehicles.add(new Bike("B002", "Bob", 5.0));
        vehicles.add(new Auto("A003", "Charlie", 7.0));

        double distance = 15.0; // Distance in km

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails());
            System.out.println("Fare for " + distance + " km: $" + vehicle.calculateFare(distance));

            if (vehicle instanceof GPS) {
                GPS gps = (GPS) vehicle;
                gps.updateLocation("City Center");
                System.out.println("Current Location: " + gps.getCurrentLocation());
            }

            System.out.println("-----------------------");
        }
    }
}
