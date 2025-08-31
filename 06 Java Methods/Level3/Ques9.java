import java.util.Scanner;

public class Ques9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        printCalendar(month, year);
    }

    public static void printCalendar(int month, int year) {
        String[] months = { "", "January", "February", "March", "April", "May", "June",
                            "July", "August", "September", "October", "November", "December" };
        int[] daysInMonth = { 0, 31, 28, 31, 30, 31, 30,
                              31, 31, 30, 31, 30, 31 };
        if (month == 2 && isLeapYear(year)) {
            daysInMonth[2] = 29;
        }
        System.out.println("   " + months[month] + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");
        int startDay = getStartDay(month, 1, year);
        for (int i = 0; i < startDay; i++) {
            System.out.print("   ");
        }
        for (int day = 1; day <= daysInMonth[month]; day++) {
            System.out.printf("%2d ", day);
            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static int getStartDay(int month, int day, int year) {
        if (month < 3) {
            month += 12;
            year--;
        }
        int k = year % 100;
        int j = year / 100;
        int h = (day + (13*(month + 1))/5 + k + (k/4) + (j/4) + 5*j) % 7;
        int dayOfWeek = ((h + 6) % 7);
        return dayOfWeek;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
