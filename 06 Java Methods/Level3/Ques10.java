import java.util.Scanner;

public class Ques10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates of point A (x1 y1):");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("Enter coordinates of point B (x2 y2):");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("Enter coordinates of point C (x3 y3):");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        if (areCollinearBySlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear (Slope Method).");
        } else {
            System.out.println("Points are NOT collinear (Slope Method).");
        }

        if (areCollinearByArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are collinear (Area Method).");
        } else {
            System.out.println("Points are NOT collinear (Area Method).");
        }
    }

    public static boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        int dx1 = x2 - x1;
        int dx2 = x3 - x2;
        int dx3 = x3 - x1;

        if (dx1 == 0 && dx2 == 0 && dx3 == 0) return true; 

        if (dx1 == 0 || dx2 == 0 || dx3 == 0) return false; 

        double slopeAB = (double)(y2 - y1) / dx1;
        double slopeBC = (double)(y3 - y2) / dx2;
        double slopeAC = (double)(y3 - y1) / dx3;

        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    public static boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * Math.abs(x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2));
        return area == 0;
    }
}
