package assistedproblem.employeemanagement;

public class Main {
    public static void main(String[] args) {
        // Create a Manager object
        Manager manager = new Manager("Ishan", 101, 100000.0, 10);
        System.out.println(" Manager Details");
        manager.displayDetails();

        // Create a Developer object
        Developer developer = new Developer("Naman", 102, 80000.0, "Java");
        System.out.println("Developer Details");
        developer.displayDetails();

        // Create an Intern object
        Intern intern = new Intern("Om", 103, 30000.0, "TIT University");
        System.out.println("Intern Details");
        intern.displayDetails();
    }

}
