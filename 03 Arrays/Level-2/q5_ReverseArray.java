import java.util.*;
public class q5_ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        //count the number of digits in a number
        int temp=n;
        int count=0;
        if(temp == 0) count=1;
        else{
            while(temp>0){
                count++;
                temp/=10;
            }
        }
        

        //isse automatically reverse mai hi aa jayega
        int arr[] = new int[count];
        for(int i=0;i<arr.length;i++){
            arr[i]=n%10;
            n/=10;

        }

        for(int num:arr){
            System.out.print(num+" ");
        }
    
    }
}
