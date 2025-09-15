public class CourseDemo {
    public static void main(String[] args) {
        Course basicCourse = new Course("Mathematics Basics", 8);
        OnlineCourse freeCourse = new OnlineCourse("Intro to Java", 6, "Udemy", true);
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Advanced Java", 12, "Coursera", true, 5000, 20);

        System.out.println("=== Basic Course ===");
        basicCourse.displayInfo();

        System.out.println("\n=== Online Course ===");
        freeCourse.displayInfo();

        System.out.println("\n=== Paid Online Course ===");
        paidCourse.displayInfo();
    }
}
