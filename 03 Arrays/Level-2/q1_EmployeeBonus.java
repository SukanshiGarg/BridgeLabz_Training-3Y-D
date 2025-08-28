import java.util.*;

public class q1_EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;  // number of employees
        double[] salary = new double[n];
        double[] years = new double[n];
        double[] bonus = new double[n];
        double[] newSalary = new double[n];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Input
        for (int i = 0; i < n; i++) {
            System.out.println("Enter salary and years of service for employee " + (i + 1) + ": ");
            double s = sc.nextDouble();
            double y = sc.nextDouble();

            // Validation
            if (s <= 0 || y < 0) {
                System.out.println("Invalid input! Salary and years must be positive. Try again.");
                i--; // retry for same employee
                continue;
            }

            salary[i] = s;
            years[i] = y;
        }

        // Calculate bonus and new salary
        for (int i = 0; i < n; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Output
        System.out.println("\n--- Employee Salary Details ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salary[i] +
                    ", Bonus = " + bonus[i] +
                    ", New Salary = " + newSalary[i]);
        }

        System.out.println("\n--- Company Totals ---");
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus Paid = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);

        sc.close();
    }
}
