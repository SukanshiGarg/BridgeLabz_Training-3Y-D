public class Main {
    public static void processOrder(FoodItem item, double discountPercent) {
        item.getItemDetails();
        double totalPrice = item.calculateTotalPrice();
        System.out.println("Total Price (before discount): ₹" + totalPrice);

        if (item instanceof Discountable) {
            Discountable discountable = (Discountable) item;
            discountable.getDiscountDetails(discountPercent);
            double finalPrice = discountable.applyDiscount(discountPercent);
            System.out.println("Final Price (after discount): ₹" + finalPrice);
        }

        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        FoodItem veg = new VegItem("Paneer Butter Masala", 250, 2);
        FoodItem nonVeg = new NonVegItem("Chicken Biryani", 300, 1);

        // Polymorphism in action
        processOrder(veg, 10);    // 10% discount
        processOrder(nonVeg, 5);  // 5% discount
    }
}

