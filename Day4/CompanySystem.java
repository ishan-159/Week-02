
import java.util.ArrayList;
import java.util.List;

// Employee Class
class Employee {
   String name;

   Employee(String name) {
       this.name = name;
   }

   public String getName() {
       return name;
   }
}

// Department Class
class Department {
   String name;
   List<Employee> employees;

   Department(String name) {
       this.name = name;
       this.employees = new ArrayList<>();
   }

   // Add an employee to the department
   public void addEmployee(String employeeName) {
       employees.add(new Employee(employeeName));
   }

   // Display department details
   public void showDetails() {
       System.out.println("Department: " + name);
       System.out.println("Employees:");
       for (Employee employee : employees) {
           System.out.println(" - " + employee.getName());
       }
   }
}

// Company Class
class Company {
   String name;
   List<Department> departments;

   Company(String name) {
       this.name = name;
       this.departments = new ArrayList<>();
   }

   // Add a department to the company
   public void addDepartment(String departmentName) {
       departments.add(new Department(departmentName));
   }

   // Add an employee to a specific department
   public void addEmployeeToDepartment(String departmentName, String employeeName) {
       for (Department department : departments) {
           if (departmentName.equals(departmentName)) {
               department.addEmployee(employeeName);
               return;
           }
       }
       System.out.println("Department not found: " + departmentName);
   }

   // Show company details
   public void showDetails() {
       System.out.println("Company: " + name);
       for (Department department : departments) {
           department.showDetails();
       }
   }

   // Simulate deletion of the company
   public void deleteCompany() {
       System.out.println("Deleting company: " + name);
       departments.clear();
       System.out.println("All departments and employees have been removed.");
   }
}

// Main Class
public class CompanySystem {
   public static void main(String[] args) {
       // Create a company
       Company company = new Company("Capgemini");

       // Add departments
       company.addDepartment("IT");
       company.addDepartment("HR");

       // Add employees to departments
       company.addEmployeeToDepartment("IT", "Ishan Tiwari");
       company.addEmployeeToDepartment("IT", "Om Yadav");
       company.addEmployeeToDepartment("HR", "Naman Banke");

       // Show company details
       company.showDetails();

       // Delete the company
       company.deleteCompany();

       company.showDetails();
   }
}

