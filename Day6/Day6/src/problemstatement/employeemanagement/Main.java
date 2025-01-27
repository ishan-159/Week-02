package problemstatement.employeemanagement;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Create list for Employees
        List<Employee> employees= new ArrayList<>();

        //create FullTimeEmployee and PartTimeEmployee object
        FullTimeEmployee fte = new FullTimeEmployee(501,"Roman Reigns",250000,100000);
        PartTimeEmployee pte = new PartTimeEmployee(502,"Dave Batista",120000,7,1000
        );

        //Set department
        fte.assignDepartment("IT");
        pte.assignDepartment("Computer Science");

        //Display Details
        fte.displayDetails();
        pte.displayDetails();

    }
}
