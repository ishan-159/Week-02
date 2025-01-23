
import java.util.ArrayList;

// Course Class
class Course {
   String courseName;
   ArrayList<Student> enrolledStudents;

   //Parametrized  Constructor
   Course(String courseName) {
       this.courseName = courseName;
       this.enrolledStudents = new ArrayList<>();
   }

   public void enrollStudent(Student student) {
       enrolledStudents.add(student);
   }

   public void displayEnrolledStudents() {
       System.out.println("Students enrolled in " + courseName + ":");
       for (Student student : enrolledStudents) {
           System.out.println("- " + student.getName());
       }
   }

   public String getCourseName() {
       return courseName;
   }
}

// Student Class
class Student {
   String name;
   ArrayList<Course> enrolledCourses;

   //Parametrized  Constructor
   Student(String name) {
       this.name = name;
       this.enrolledCourses = new ArrayList<>();
   }

   public void enrollInCourse(Course course) {
       enrolledCourses.add(course);
       course.enrollStudent(this); // Add the student to the course's list as well
   }

   public void displayCourses() {
       System.out.println(name + " is enrolled in the following courses:");
       for (Course course : enrolledCourses) {
           System.out.println("- " + course.getCourseName());
       }
   }

   public String getName() {
       return name;
   }
}

// School Class
class School {
   String schoolName;
   ArrayList<Student> students;

   // Constructor to initialize a school
   School(String schoolName) {
       this.schoolName = schoolName;
       this.students = new ArrayList<>();
   }

   public void addStudent(Student student) {
       students.add(student);
   }

   public void displayStudents() {
       System.out.println("Students in " + schoolName + ":");
       for (Student student : students) {
           System.out.println("- " + student.getName());
       }
   }
}

public class SchoolAndStudents {
   public static void main(String[] args) {
       // Create Course objects
       Course math = new Course("Mathematics");
       Course science = new Course("Science");
       Course history = new Course("History");

       // Create Student objects
       Student stu1 = new Student("Naman");
       Student stu2 = new Student("Om");

       // Enroll students in courses
       stu1.enrollInCourse(math);
       stu1.enrollInCourse(science);
       stu2.enrollInCourse(science);
       stu2.enrollInCourse(history);

       // Create a School object and add students
       School highSchool = new School("High School");
       highSchool.addStudent(stu1);
       highSchool.addStudent(stu2);

       // Display school information
       highSchool.displayStudents();

       // Display each student's enrolled courses
       stu1.displayCourses();
       stu2.displayCourses();

       // Display students enrolled in each course
       math.displayEnrolledStudents();
       science.displayEnrolledStudents();
       history.displayEnrolledStudents();
   }
}

