import java.util.*;
public class q10_HeightCalculations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter the height in cms is : ");
        double cm= sc.nextDouble();

        double inches = cm/2.54;
        int feet=(int) inches %12;
        int remains=(int)inches/12;
         System.out.println("Your Height in cm is " + cm + " while in feet is " + feet + " and inches is " + remains);

         sc.close();
    }
}
