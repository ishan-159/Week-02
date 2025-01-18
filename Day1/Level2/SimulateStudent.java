import java.util.Scanner;
class StudentReport{
    //Attributes
    String name;
    int rollNumber;
    double marks;
    //Constructor
    public StudentReport(String name, int rollNumber, double marks){
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    //Method to CalculateGrade
    public String CalculateGrade(){
        if(marks >= 90){
            return "A+";
        }
        else if(marks < 90 && marks >= 80){
            return "A";
        }
        else if(marks < 70 && marks >= 60){
            return "B";
        }
        else if(marks < 60 && marks >= 50){
            return "C+";
        }
        else if(marks < 50 && marks >= 33){
            return "C";
        }
        else{
            return "Fail";
        }
    }
    //Display all the details
    public void DisplayReport(){
        System.out.println("Student Name : " + name);
        System.out.println("Student Roll Number : " + rollNumber);
        System.out.println("Student Marks : " + marks);
        System.out.println("Grade of student : " + CalculateGrade());
    }
}

public class SimulateStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name : ");
        String name = input.nextLine();
        System.out.println("Enter roll number of student : ");
        int rollNumber = input.nextInt();
        System.out.println("Enter students marks : ");
        double marks = input.nextDouble();
        //Create object of StudentReport
        StudentReport student1 = new StudentReport(name,rollNumber,marks);
        student1.DisplayReport();
    }
}
