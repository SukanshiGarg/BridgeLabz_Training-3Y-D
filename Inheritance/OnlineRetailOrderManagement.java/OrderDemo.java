public class OrderDemo {
    public static void main(String[] args) {
        Order order = new Order(101, "2025-09-15");
        ShippedOrder shippedOrder = new ShippedOrder(102, "2025-09-10", "TRK12345");
        DeliveredOrder deliveredOrder = new DeliveredOrder(103, "2025-09-05", "TRK67890", "2025-09-12");

        System.out.println(order.getOrderStatus());
        System.out.println(shippedOrder.getOrderStatus());
        System.out.println(deliveredOrder.getOrderStatus());
    }
}
