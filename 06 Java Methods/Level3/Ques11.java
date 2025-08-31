import java.util.Random;

public class Ques11 {
    public static void main(String[] args) {
        int employees = 10;
        double[][] empData = generateSalaryAndService(employees);
        double[][] updatedData = calculateBonusAndNewSalary(empData);
        displaySalaryTable(empData, updatedData);
    }

    public static double[][] generateSalaryAndService(int n) {
        double[][] data = new double[n][2]; // [salary, years of service]
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            data[i][0] = 10000 + rand.nextInt(90000); // 5-digit salary
            data[i][1] = 1 + rand.nextInt(20); // years of service 1-20
        }
        return data;
    }

    public static double[][] calculateBonusAndNewSalary(double[][] empData) {
        double[][] updatedData = new double[empData.length][2]; // [new salary, bonus]
        for (int i = 0; i < empData.length; i++) {
            double salary = empData[i][0];
            double years = empData[i][1];
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;
            updatedData[i][0] = newSalary;
            updatedData[i][1] = bonus;
        }
        return updatedData;
    }

    public static void displaySalaryTable(double[][] oldData, double[][] newData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-10s %-12s %-8s %-12s %-10s\n", 
                          "Employee", "Old Salary", "Years", "Bonus", "New Salary");

        for (int i = 0; i < oldData.length; i++) {
            double oldSalary = oldData[i][0];
            double years = oldData[i][1];
            double bonus = newData[i][1];
            double newSalary = newData[i][0];

            System.out.printf("%-10d %-12.2f %-8.0f %-12.2f %-10.2f\n",
                              (i+1), oldSalary, years, bonus, newSalary);

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;
        }

       
        System.out.printf("%-10s %-12.2f %-8s %-12.2f %-10.2f\n", 
                          "Total", totalOldSalary, "", totalBonus, totalNewSalary);
    }
}
