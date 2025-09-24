// Base class: Course
class Course {
    String courseName;
    int duration; // Duration in hours

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

// Subclass: OnlineCourse extends Course
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Subclass: PaidOnlineCourse extends OnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; // Discount in percentage

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fee: ₹" + fee);
        System.out.println("Discount: " + discount + "%");
    }
}

// Test class
public class CourseHierarchyTest {
    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse(
                "Advanced Java Programming", 50, "Coursera", true, 4999.0, 20.0);
        poc.displayDetails();
    }
}
