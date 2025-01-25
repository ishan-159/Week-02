package assistedproblem.employeemanagement;

// Subclass
class Intern extends Employee {
    String university;

    Intern(String name, int id, double salary, String university) {
        super(name, id, salary); // Call the constructor of the superclass
        this.university = university;
    }

    public void displayDetails() {
        super.displayDetails(); // Call the superclass method
        System.out.println("University: " + university);
    }
}


