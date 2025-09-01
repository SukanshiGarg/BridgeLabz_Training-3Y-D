package Encapsulation;

public class StudentMain {
    public static void main(String[] args) {
        StudentService studentService = new StudentService();
        studentService.setStudentDetails();
        studentService.displayStudentDetails();
    }
}
