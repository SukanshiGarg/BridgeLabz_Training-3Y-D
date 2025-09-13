import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]){
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee emp1 = new FullTimeEmployee(101,"Sukanshi Garg",50000);
        emp1.assignDepartment("IT");

        PartTimeEmployee emp2 = new PartTimeEmployee(102,"BOB", 500,40);
        emp2.assignDepartment("HR");

        employees.add(emp1);
        employees.add(emp2);

        for(Employee emp : employees){
            emp.displayDetails();
            System.out.println("Calcualted Sa;ry : "+ emp.calculateSalary());

            if(emp instanceof Department){
               Department dept = (Department) emp;
               System.out.println(dept.getDepartmentDetails());
            }
            System.out.println("---------------------");
        }
    }
}
