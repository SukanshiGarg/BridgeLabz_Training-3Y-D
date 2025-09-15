/*
 Problem 6: Online Food Delivery System
 Description: Create an online food delivery system:
 - Define an abstract class FoodItem with fields like itemName, price, and quantity.
 - Add abstract methods calculateTotalPrice() and concrete methods like getItemDetails().
 - Extend it into classes VegItem and NonVegItem, overriding calculateTotalPrice() 
   to include additional charges (e.g., for non-veg items).
 - Use an interface Discountable with methods applyDiscount() and getDiscountDetails().
 - Demonstrate encapsulation to restrict modifications to order details 
   and use polymorphism to handle different types of food items in a single order-processing method.
*/

public abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Encapsulation (getters)
    public String getItemName() { return itemName; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    // Abstract method
    public abstract double calculateTotalPrice();

    // Concrete method
    public void getItemDetails() {
        System.out.println("Item: " + itemName + " | Price: ₹" + price + " | Quantity: " + quantity);
    }
}


