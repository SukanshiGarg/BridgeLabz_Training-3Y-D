package RestaurantManagement;

public class RestaurantDemo {
    public static void main(String[] args) {
        Worker chef = new Chef("Alice", 101, "Italian Cuisine");
        Worker waiter = new Waiter("Bob", 201, 5);

        System.out.println("=== Chef Info ===");
        ((Chef) chef).displayInfo();
        chef.performDuties();

        System.out.println("\n=== Waiter Info ===");
        ((Waiter) waiter).displayInfo();
        waiter.performDuties();
    }
}
