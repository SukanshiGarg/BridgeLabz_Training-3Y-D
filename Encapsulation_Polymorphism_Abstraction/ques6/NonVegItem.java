/*
 Subclass: NonVegItem (Problem 6: Online Food Delivery System)
 - Includes additional 10% non-veg service charge
*/

public class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double baseTotal = getPrice() * getQuantity();
        return baseTotal + (baseTotal * 0.10); // 10% extra charge
    }

    @Override
    public double applyDiscount(double discountPercent) {
        double total = calculateTotalPrice();
        return total - (total * discountPercent / 100);
    }

    @Override
    public void getDiscountDetails(double discountPercent) {
        System.out.println("Discount applied on Non-Veg Item: " + discountPercent + "%");
    }
}

