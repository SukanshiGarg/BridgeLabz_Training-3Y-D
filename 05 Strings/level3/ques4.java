import java.util.Scanner;

public class ques4 {

    public static String[][] charFrequency(String str) {
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) count++;
        }

        String[][] result = new String[count][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = Character.toString((char) i);
                result[index][1] = Integer.toString(freq[i]);
                index++;
            }
        }

        return result;
    }

    public static void displayFrequency(String[][] data) {
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%-10s %-10s%n", data[i][0], data[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] freqResult = charFrequency(input);
        displayFrequency(freqResult);

        sc.close();
    }
}
