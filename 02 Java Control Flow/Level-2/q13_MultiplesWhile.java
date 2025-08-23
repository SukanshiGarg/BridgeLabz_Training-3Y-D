import java.util.*;

public class q13_MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number > 0 && number < 100) {
            int multiple = number;

            System.out.println("Multiples of " + number + " below 100:");
            while (multiple < 100) {
                System.out.print(multiple + " ");
                multiple += number; // go to next multiple
            }
        } else {
            System.out.println("Please enter a positive integer less than 100.");
        }

        sc.close();
    }
}
