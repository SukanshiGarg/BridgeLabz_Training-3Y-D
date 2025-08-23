import java.util.*;
public class q10_GreatestFWhile {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=n/2;
        int factor=1;
        while(i>=1){
            if(n%i==0){
                factor=i;
                break;
            }
            i--;

        }
        System.out.println(factor);
        sc.close();

    }
}
