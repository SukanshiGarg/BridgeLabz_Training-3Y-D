import java.util.*;

public class Assignment {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.print("Enter ques number: ");
            choice = sc.nextInt();

            switch (choice) {
                // Q1. Leap Year (if-else)
                case 1:
                    System.out.print("Enter a year: ");
                    int year1 = sc.nextInt();
                    if (year1 % 400 == 0) {
                        System.out.println(year1 + " is a Leap Year.");
                    } else if (year1 % 100 == 0) {
                        System.out.println(year1 + " is NOT a Leap Year.");
                    } else if (year1 % 4 == 0) {
                        System.out.println(year1 + " is a Leap Year.");
                    } else {
                        System.out.println(year1 + " is NOT a Leap Year.");
                    }
                    break;

                // Q2. Leap Year (logical operators)
                case 2:
                    System.out.print("Enter a year: ");
                    int year2 = sc.nextInt();
                    if ((year2 % 4 == 0 && year2 % 100 != 0) || (year2 % 400 == 0)) {
                        System.out.println(year2 + " is a Leap Year.");
                    } else {
                        System.out.println(year2 + " is NOT a Leap Year.");
                    }
                    break;

                // Q3. Student Grades
                case 3:
                    System.out.print("Enter marks of 3 subjects: ");
                    int m1 = sc.nextInt(),
                     m2 = sc.nextInt(),
                     m3 = sc.nextInt();
                    double avg = (m1 + m2 + m3) / 3.0;
                    System.out.println("Average: " + avg);

                    String grade,
                     remarks;
                    if (avg >= 90) {
                        grade = "A";
                        remarks = "Excellent";
                    } else if (avg >= 75) {
                        grade = "B";
                        remarks = "Good";
                    } else if (avg >= 50) {
                        grade = "C";
                        remarks = "Average";
                    } else {
                        grade = "F";
                        remarks = "Fail";
                    }
                    System.out.println("Grade: " + grade + " | Remarks: " + remarks);
                    break;

                // Q4. Prime Number
                case 4:
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();
                    boolean isPrime = num > 1;
                    for (int i = 2; i <= Math.sqrt(num); i++) {
                        if (num % i == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                    System.out.println(num + (isPrime ? " is Prime." : " is NOT Prime."));
                    break;

                // Q5. Armstrong Number
                case 5:
                    System.out.print("Enter a number: ");
                    int arm = sc.nextInt();
                    int sum = 0,
                     temp = arm,
                     digits = String.valueOf(arm).length();
                    while (temp > 0) {
                        int d = temp % 10;
                        sum += Math.pow(d, digits);
                        temp /= 10;
                    }
                    System.out.println(arm + (sum == arm ? " is an Armstrong Number." : " is NOT an Armstrong Number."));
                    break;

                // Q6. Count Digits
                case 6:
                    System.out.print("Enter a number: ");
                    int num2 = sc.nextInt();
                    int count = String.valueOf(num2).length();
                    System.out.println("Number of digits: " + count);
                    break;

                // Q7. BMI Calculator
                case 7:
                    System.out.print("Enter weight (kg): ");
                    double weight = sc.nextDouble();
                    System.out.print("Enter height (m): ");
                    double height = sc.nextDouble();
                    double bmi = weight / (height * height);
                    System.out.printf("BMI = %.2f\n", bmi);
                    if (bmi < 18.5) {
                        System.out.println("Category: Underweight");
                    } else if (bmi < 25) {
                        System.out.println("Category: Normal weight");
                    } else if (bmi < 30) {
                        System.out.println("Category: Overweight");
                    } else {
                        System.out.println("Category: Obese");
                    }
                    break;

                // Q8. Harshad Number
                case 8:
                    System.out.print("Enter a number: ");
                    int hnum = sc.nextInt();
                    int sumDigits = 0,
                     temp2 = hnum;
                    while (temp2 > 0) {
                        sumDigits += temp2 % 10;
                        temp2 /= 10;
                    }
                    System.out.println(hnum + (hnum % sumDigits == 0 ? " is a Harshad Number." : " is NOT a Harshad Number."));
                    break;

                // Q9. Abundant Number
                case 9:
                    System.out.print("Enter a number: ");
                    int anum = sc.nextInt();
                    int divSum = 0;
                    for (int i = 1; i <= anum / 2; i++) {
                        if (anum % i == 0) {
                            divSum += i;
                        }
                    }
                    System.out.println(anum + (divSum > anum ? " is Abundant." : " is NOT Abundant."));
                    break;

                // Q10. Calculator
                case 10:
                    System.out.print("Enter first number: ");
                    double a = sc.nextDouble();
                    System.out.print("Enter operator (+ - * /): ");
                    char op = sc.next().charAt(0);
                    System.out.print("Enter second number: ");
                    double b = sc.nextDouble();
                    switch (op) {
                        case '+':
                            System.out.println("Result = " + (a + b));
                            break;
                        case '-':
                            System.out.println("Result = " + (a - b));
                            break;
                        case '*':
                            System.out.println("Result = " + (a * b));
                            break;
                        case '/':
                            System.out.println(b != 0 ? "Result = " + (a / b) : "Division by zero!");
                            break;
                        default:
                            System.out.println("Invalid Operator");
                    }
                    break;

                // Q11. Day of Week (Formula)
                case 11:
                    System.out.print("Enter day: ");
                    int d = sc.nextInt();
                    System.out.print("Enter month: ");
                    int m = sc.nextInt();
                    System.out.print("Enter year: ");
                    int y = sc.nextInt();
                    if (m < 3) {
                        m += 12;
                        y--;
                    }
                    int k = y % 100,
                     j = y / 100;
                    int f = d + 13 * (m + 1) / 5 + k + k / 4 + j / 4 + 5 * j;
                    int dow = f % 7;
                    String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
                    System.out.println("Day of Week: " + days[dow]);
                    break;

                case 0:
                    System.out.println("Exiting... Bye!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 0);

        sc.close();
    }
}