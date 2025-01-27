package problemstatement.onlinefooddelivery;

// VegItem.java (Subclass)
public class VegItem extends FoodItem implements Discountable {
    private double discount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0.0;
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity() - discount;
    }

    public void applyDiscount(double discountRate) {
        discount = getPrice() * getQuantity() * discountRate / 100;
    }

    public String getDiscountDetails() {
        return "Discount Applied: $" + discount;
    }
}

