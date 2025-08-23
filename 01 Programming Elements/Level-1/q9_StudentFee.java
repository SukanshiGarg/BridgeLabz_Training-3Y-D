import java.util.*;
public class q9_StudentFee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the student's Fees: ");
        int fees=sc.nextInt();
        System.out.print("Enter the discoubnt offered to the student : ");
        double discountPercent=sc.nextDouble();
        double discount= fees * discountPercent/100.0;
        double finalFee=fees-discount;
        System.err.println("The payable fees for the student in INR is  :"+ finalFee);

        sc.close();
    }
}
