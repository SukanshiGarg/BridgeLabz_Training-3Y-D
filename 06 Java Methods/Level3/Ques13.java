import java.util.Random;
import java.util.Scanner;

public class Ques13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = generateRandomMarks(n);
        double[][] results = calculateTotalAveragePercentage(marks);
        displayScorecard(marks, results);
    }

    public static int[][] generateRandomMarks(int n) {
        int[][] scores = new int[n][3];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            scores[i][0] = 10 + rand.nextInt(91); 
            scores[i][1] = 10 + rand.nextInt(91); 
            scores[i][2] = 10 + rand.nextInt(91); 
        }
        return scores;
    }

    public static double[][] calculateTotalAveragePercentage(int[][] marks) {
        double[][] res = new double[marks.length][3]; 
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            res[i][0] = Math.round(total * 100.0) / 100.0;
            res[i][1] = Math.round(average * 100.0) / 100.0;
            res[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return res;
    }

    public static void displayScorecard(int[][] marks, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < marks.length; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(marks[i][0] + "\t" + marks[i][1] + "\t" + marks[i][2] + "\t");
            System.out.print(results[i][0] + "\t" + results[i][1] + "\t" + results[i][2]);
            System.out.println();
        }
    }
}
