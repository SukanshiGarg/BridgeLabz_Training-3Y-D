import java.util.*;

public class q7_Bmi2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3]; 
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nPerson " + (i + 1));

            double h, w;
            do {
                System.out.print("Height (m, positive): ");
                h = sc.nextDouble();
            } while (h <= 0);

            do {
                System.out.print("Weight (kg, positive): ");
                w = sc.nextDouble();
            } while (w <= 0);

            double bmi = w / (h * h);

            personData[i][0] = h;
            personData[i][1] = w;
            personData[i][2] = bmi;

            if (bmi < 18.5) weightStatus[i] = "Underweight";
            else if (bmi < 25) weightStatus[i] = "Normal";
            else if (bmi < 30) weightStatus[i] = "Overweight";
            else weightStatus[i] = "Obese";
        }

        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d: H=%.2f m, W=%.2f kg, BMI=%.2f, %s%n",
                    (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        sc.close();
    }
}
