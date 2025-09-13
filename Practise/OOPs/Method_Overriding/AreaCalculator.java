public class AreaCalculator {
    int area(int side){
        return side*side;
    }
    int area(int length,int breadth){
        return length*breadth;
    }
    double area(double radius){
        return Math.PI*radius*radius;
    }
    public static void main(String[] args) {
        AreaCalculator cal = new AreaCalculator();
        System.out.println(cal.area(23));
        System.out.println(cal.area(23,48));
        System.out.println(cal.area(12));
        
    }
}
