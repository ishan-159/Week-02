package multilevelinheritance.educationalcoursesystem;

// Superclass
class Course {
    String courseName;
    int duration; // Duration in hours

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}



