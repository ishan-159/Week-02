package assistedproblem.employeemanagement;

// Subclass
class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary); // Call the constructor of the superclass
        this.programmingLanguage = programmingLanguage;
    }

    public void displayDetails() {
        super.displayDetails(); // Call the superclass method
        System.out.println("Programming Language: " + programmingLanguage);
    }
}


