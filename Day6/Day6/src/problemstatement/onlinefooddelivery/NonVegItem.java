package problemstatement.onlinefooddelivery;

// NonVegItem.java (Subclass)
class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharge;
    private double discount;

    public NonVegItem(String itemName, double price, int quantity, double additionalCharge) {
        super(itemName, price, quantity);
        this.additionalCharge = additionalCharge;
        this.discount = 0.0;
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity() + additionalCharge - discount;
    }

    public void applyDiscount(double discountRate) {
        discount = (getPrice() * getQuantity() + additionalCharge) * discountRate / 100;
    }

    public String getDiscountDetails() {
        return "Discount Applied: $" + discount;
    }
}

