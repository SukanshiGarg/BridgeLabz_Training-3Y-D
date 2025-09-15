package SchoolSystem;

public class SchoolDemo {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Alice", 35, "Mathematics");
        Student s1 = new Student("Bob", 16, "10th Grade");
        Staff st1 = new Staff("Charlie", 40, "Administration");

        System.out.println("=== Teacher Info ===");
        t1.displayRole();

        System.out.println("\n=== Student Info ===");
        s1.displayRole();

        System.out.println("\n=== Staff Info ===");
        st1.displayRole();
    }
}
