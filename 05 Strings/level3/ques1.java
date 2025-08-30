import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        System.out.printf("%-10s %-10s %-10s %-15s%n", "Height(cm)", "Weight(kg)", "BMI", "Status");

        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightM = data[i][1] / 100.0;
            double bmi = weight / (heightM * heightM);
            String status;

            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 25) status = "Normal";
            else if (bmi < 30) status = "Overweight";
            else status = "Obese";

            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", data[i][1], data[i][0], bmi, status);
        }

        sc.close();
    }
}
