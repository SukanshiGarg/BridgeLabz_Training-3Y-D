import java.util.Scanner;

public class ques6 {

    public static String[][] charFrequency(String str) {
        char[] chars = str.toCharArray();
        int len = chars.length;
        int[] freq = new int[len];

        for (int i = 0; i < len; i++) {
            if (chars[i] == '0') continue;
            freq[i] = 1;
            for (int j = i + 1; j < len; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // Mark duplicate
                }
            }
        }

        int count = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') count++;
        }

        String[][] result = new String[count][2];
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (chars[i] != '0') {
                result[index][0] = Character.toString(chars[i]);
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
