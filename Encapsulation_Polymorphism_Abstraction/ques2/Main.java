
public class Main {
    // Method to calculate final price (price + tax - discount)
    public static void printFinalPrice(Product product) {
        double discount = product.calculateDiscount();
        double tax = 0;

        if (product instanceof Taxable) {
            tax = ((Taxable) product).calculateTax();
            System.out.println(((Taxable) product).getTaxDetails());
        }

        double finalPrice = product.getPrice() + tax - discount;
        System.out.println("Product: " + product.getName() +
                           ", Base Price: " + product.getPrice() +
                           ", Discount: " + discount +
                           ", Tax: " + tax +
                           ", Final Price: " + finalPrice);
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        Product p1 = new Electronics(201, "Laptop", 60000);
        Product p2 = new Clothing(202, "T-Shirt", 1500);
        Product p3 = new Groceries(203, "Rice Bag", 2000);

        // Polymorphism in action
        printFinalPrice(p1);
        printFinalPrice(p2);
        printFinalPrice(p3);
    }
}


