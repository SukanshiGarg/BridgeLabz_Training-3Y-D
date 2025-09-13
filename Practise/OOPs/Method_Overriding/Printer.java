public class Printer {
        void print(String message){
            System.out.println(message);
        }
        void print(int number){
            System.out.println(number);
        }
}

class ColorPrinter extends Printer{
    void print(String messsage){
        System.out.println("In color: "+messsage);
    }


public static void main(String[] args) {
    Printer p=new Printer();
    ColorPrinter cp =new ColorPrinter();
    p.print("Hello World");
    p.print(123);
    cp.print("Red");

}

}
