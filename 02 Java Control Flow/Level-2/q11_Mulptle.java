import java.util.*;
public class q11_Mulptle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int multiple=n;
        while(multiple < 100 ){
            System.out.println(multiple + " ");
            multiple += n;
        }

        sc.close();
    }
}
