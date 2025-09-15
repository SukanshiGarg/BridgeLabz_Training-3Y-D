/*
 Subclass: VegItem (Problem 6: Online Food Delivery System)
 - No extra charges, just base price * quantity
*/

public class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount(double discountPercent) {
        double total = calculateTotalPrice();
        return total - (total * discountPercent / 100);
    }

    @Override
    public void getDiscountDetails(double discountPercent) {
        System.out.println("Discount applied on Veg Item: " + discountPercent + "%");
    }
}

