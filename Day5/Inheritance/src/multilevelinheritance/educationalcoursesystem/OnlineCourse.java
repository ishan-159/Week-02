package multilevelinheritance.educationalcoursesystem;

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration); // Call the constructor of the superclass
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    public void displayInfo() {
        super.displayInfo(); // Call the superclass method
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}


