package assistedproblem.employeemanagement;

// Subclass
class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary); // Call the constructor of the superclass
        this.teamSize = teamSize;
    }

    public void displayDetails() {
        super.displayDetails(); // Call the superclass method
        System.out.println("Team Size: " + teamSize);
    }
}


