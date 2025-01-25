package multilevelinheritance.onlineretail;

class ShippedOrder extends Order{
    int trackingNumber;
    ShippedOrder(int orderId, String orderDate, int trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    public void displayShippedOrder(){
        super.displayOrder();
        System.out.println("Tracking Number : " + trackingNumber);
    }
    public String getOrderStatus(){
        return "Order Shipped";
    }
}

