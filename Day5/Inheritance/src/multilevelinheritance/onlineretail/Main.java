package multilevelinheritance.onlineretail;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(123,"24-01-2025");
        ShippedOrder shipOrder = new ShippedOrder(124,"25-01-2025",54321);
        DeliveredOrder deliver = new DeliveredOrder(125,"25-01-2025",4567,30-01-2025);
        System.out.println("Order Details");
        order.displayOrder();
        System.out.println(order.getOrderStatus());
        System.out.println("Shipped Order Details");
        shipOrder.displayShippedOrder();
        System.out.println(shipOrder.getOrderStatus());
        System.out.println("Delivered Order");
        deliver.displayDeliveredOrder();
        System.out.println(deliver.getOrderStatus());
    }
}
