package problemstatement.vehiclerental;

// Car.java (Subclass)
class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, String type, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, type, rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance() {
        return 500.0; // Example fixed insurance rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: " + insurancePolicyNumber;
    }
}

