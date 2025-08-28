import java.util.*;
public class q2_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        
        System.out.println("The largest of the three numbers is " + largest(n1, n2, n3));
        
        sc.close();
    }

    public static int largest(int num1, int num2, int num3) {
        int largest = Math.max(num1, Math.max(num2, num3));
        return largest;
    }
}
