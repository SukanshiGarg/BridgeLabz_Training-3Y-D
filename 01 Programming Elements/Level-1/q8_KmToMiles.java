import java.util.*;
public class q8_KmToMiles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int distance=sc.nextInt();
        double dinMiles=distance/1.6;
        System.err.println("The distance of "+distance+" kms in miles is "+ dinMiles+"Miles");
        sc.close();
    }
}
