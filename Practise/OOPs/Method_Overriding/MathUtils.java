public class MathUtils {
    int add (int a, int b) {
        return a + b;
    }
    double add(double a,double b){
        return (int) a+b;
    }

    int add(int a, int b,int c){
        return a+b+c;
    }

    public static void main(String args[]){
         //call the methods 
         MathUtils test = new MathUtils();
         System.out.println(test.add(2,4));
         System.out.println(test.add(0, 0));
         System.out.println(test.add(23,34,56));
    }
}
