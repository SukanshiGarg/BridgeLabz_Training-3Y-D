import java.util.Scanner;

public class Q2 {
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static String[] customSplit(String str) {
        int len = findLength(str);
        int spaceCount = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        int[] spaceIndex = new int[spaceCount + 2];
        spaceIndex[0] = -1;
        int idx = 1;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndex[idx++] = i;
            }
        }
        spaceIndex[idx] = len;
        String[] words = new String[spaceCount + 1];
        for (int i = 0; i < words.length; i++) {
            int start = spaceIndex[i] + 1;
            int end = spaceIndex[i + 1];
            String word = "";
            for (int j = start; j < end; j++) {
                word += str.charAt(j);
            }
            words[i] = word;
        }
        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();
        String[] customWords = customSplit(input);
        String[] builtInWords = input.split(" ");
        System.out.println("Custom split result:");
        for (String w : customWords) {
            System.out.println(w);
        }
        System.out.println("Built-in split result:");
        for (String w : builtInWords) {
            System.out.println(w);
        }
        boolean isEqual = compareArrays(customWords, builtInWords);
        System.out.println("Arrays are equal: " + isEqual);
        sc.close();
    }
}
