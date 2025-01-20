class Course {
    String courseName;
    int duration; // Duration in weeks
    double fee;
    static String instituteName = "Default Institute"; // Class variable for institute name

    // Constructor
    public Course(String name, int duration, double fee) {
        this.courseName = name;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute: " + instituteName);
    }

    // Class method to update institute name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}
public class OnlineCourse{
    public static void main(String[] args) {
        // Creating courses
        Course course1 = new Course("Java Programming", 6, 300.00);
        Course course2 = new Course("Web Development", 8, 400.00);

        System.out.println("Course 1 Details:");
        course1.displayCourseDetails();

        System.out.println("\nCourse 2 Details:");
        course2.displayCourseDetails();

        Course.updateInstituteName("Tech Academy");

        System.out.println("After Updating Institute Name:");
        System.out.println("Course 1 Details:");
        course1.displayCourseDetails();

        System.out.println("Course 2 Details:");
        course2.displayCourseDetails();
    }
}
