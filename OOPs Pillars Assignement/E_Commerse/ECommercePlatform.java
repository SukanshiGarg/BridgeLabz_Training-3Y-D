import java.util.*;

public class ECommercePlatform {

    // Method to calculate final price (Polymorphism)
    public static void printFinalPrices(List<Product> products) {
        for (Product p : products) {
            double discount = p.calculateDiscount();
            double tax = (p instanceof Taxable) ? ((Taxable)p).calculatetax() : 0.0;
            double finalPrice = p.getPrice() + tax - discount;

            System.out.println("Product: " + p.getName());
            System.out.println("  Base Price: " + p.getPrice());
            System.out.println("  Discount: -" + discount);
            System.out.println("  Tax: +" + tax);
            System.out.println("  Final Price: " + finalPrice);

            if (p instanceof Taxable) {
                System.out.println("  " + ((Taxable)p).getTaxDetails());
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<Product> cart = new ArrayList<>();
        cart.add(new Electronics(101, "Laptop", 50000));
        cart.add(new Clothing(102, "T-Shirt", 1000));
        cart.add(new Groceries(103, "Rice", 500));

        printFinalPrices(cart);
    }
}
