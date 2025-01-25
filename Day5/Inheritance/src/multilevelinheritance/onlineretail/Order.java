package multilevelinheritance.onlineretail;

class Order{
    int orderId;
    String orderDate;
    Order(int orderId, String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    public void displayOrder() {
        System.out.println("Order Id : " + orderId);
        System.out.println("Order Date : " + orderDate);
    }
    public String getOrderStatus(){
        return "Order Placed";
    }
}

