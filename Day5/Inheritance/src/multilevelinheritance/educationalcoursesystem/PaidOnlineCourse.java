package multilevelinheritance.educationalcoursesystem;

// Subclass
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; // Discount percentage

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded); // Call the constructor of the superclass
        this.fee = fee;
        this.discount = discount;
    }

    public double calculateFinalFee() {
        return fee - (fee * discount / 100);
    }

    public void displayInfo() {
        super.displayInfo(); // Call the superclass method
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee: $" + calculateFinalFee());
    }
}


