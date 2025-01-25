package multilevelinheritance.onlineretail;

class DeliveredOrder extends ShippedOrder{
    int deliveryDate;
    DeliveredOrder(int orderId, String orderDate, int trackingNumber, int deliveryDate){
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    public void displayDeliveredOrder(){
        super.displayShippedOrder();
        System.out.println("Delivery Date : " + deliveryDate);
    }
    public String getOrderStatus(){
        return "Order Delivered";
    }
}

