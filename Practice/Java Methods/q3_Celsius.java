import java.util.*;
public class q3_Celsius{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double temp=sc.nextDouble();
        System.out.println("temperture in celsius is"+convert(temp));
    }

    public static double convert(double celsius){
        double fahrenheit=(celsius*9/5)+32;
        return fahrenheit;
    }
}