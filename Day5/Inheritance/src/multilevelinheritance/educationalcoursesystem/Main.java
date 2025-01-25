package multilevelinheritance.educationalcoursesystem;

public class Main {
    public static void main(String[] args) {
        // Create a Course object
        Course course = new Course("Introduction to Programming", 40);
        System.out.println("Course Details");
        course.displayInfo();

        System.out.println("Online Course Details");
        // Create an OnlineCourse object
        OnlineCourse onlineCourse = new OnlineCourse("Java for Beginners", 30, "Udemy", true);
        onlineCourse.displayInfo();

        System.out.println("Paid Online Course Details");
        // Create a PaidOnlineCourse object
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Advanced Java", 50, "Coursera", true, 200, 20);
        paidOnlineCourse.displayInfo();
    }

}
