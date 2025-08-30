import java.util.*;
public class age {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of the students : ");
        int n=sc.nextInt();
        int students[]=new int[n];

        for(int i=0;i<n;i++){
            students[i]=sc.nextInt();
        }

        for(int i=0;i<students.length;i++){
            if(students[i]<0) System.out.println("Inavalid Age");
            else{
                if(students[i]>18){
                    System.out.println("The student with the age"+students[i]+"can vote.");
                }
                else{
                    System.out.println("The student with the age"+ students[i]+"cannot vote");
                }
            }

        }
        sc.close();


    }
}
