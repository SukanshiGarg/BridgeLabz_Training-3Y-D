import java.util.*;
public class q9_CountDownForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        countDown(num);
        sc.close();

    }
    public static void countDown(int num){
        for(int i=num;i>=1;i--){
            System.out.println(i);
        }
    }
}
