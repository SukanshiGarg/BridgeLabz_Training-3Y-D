//package Level1;
import java.util.*;
public class ques1 {

    
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        boolean resultCharAt = compareStrings(str1, str2);
        boolean resultEquals = str1.equals(str2);

        System.out.println(resultCharAt);
        System.out.println(resultEquals);

        sc.close();
    }
}
