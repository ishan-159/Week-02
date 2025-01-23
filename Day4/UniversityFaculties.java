
import java.util.ArrayList;

class Department {
   String departmentName;

   //Parameterized Constructor
   Department(String departmentName) {
       this.departmentName = departmentName;
   }

   // Method to display department details
   public void displayDetails() {
       System.out.println("Department: " + departmentName);
   }
}

class Faculty {
   String facultyName;

   // Constructor
   Faculty(String facultyName) {
       this.facultyName = facultyName;
   }

   // Method to display faculty details
   public void displayDetails() {
       System.out.println("Faculty: " + facultyName);
   }
}

class University {
   String universityName;
   ArrayList<Department> departments; // Composition relationship
   ArrayList<Faculty> faculties; // Aggregation relationship

   // Constructor to initialize a university
   University(String universityName) {
       this.universityName = universityName;
       this.departments = new ArrayList<>();
       this.faculties = new ArrayList<>();
   }

   // Method to add a department
   public void addDepartment(Department department) {
       departments.add(department);
   }

   // Method to add a faculty member
   public void addFaculty(Faculty faculty) {
       faculties.add(faculty);
   }

   // Method to display university details
   public void displayDetails() {
       System.out.println("University: " + universityName);

       System.out.println("Departments:");
       for (Department department : departments) {
           department.displayDetails();
       }

       System.out.println("Faculties:");
       for (Faculty faculty : faculties) {
           faculty.displayDetails();
       }
   }

   // Method to delete the university (deletes all departments)
   public void deleteUniversity() {
       System.out.println("Deleting University: " + universityName);
       departments.clear(); // Remove all departments
   }
}

public class UniversityFaculties {
   public static void main(String[] args) {
       // Create Faculty members
       Faculty fac1 = new Faculty("Manoj Tyagi");
       Faculty fac2 = new Faculty("Vivek Sharma");

       // Create Departments
       Department cs = new Department("Computer Science");
       Department mech = new Department("Mechanical Engineering");

       // Create a University
       University uni = new University("Tech University");

       // Add Departments to the University
       uni.addDepartment(cs);
       uni.addDepartment(mech);

       // Add Faculty members to the University
       uni.addFaculty(fac1);
       uni.addFaculty(fac2);

       // Display University details
       System.out.println("Before deleting the University:");
       uni.displayDetails();

       // Delete the University
       uni.deleteUniversity();

       // Display University details after deletion
       System.out.println("\nAfter deleting the University:");
       uni.displayDetails();

       // Faculty still exists independently
       System.out.println("\nIndependent Faculties:");
       fac1.displayDetails();
       fac2.displayDetails();
   }
}

