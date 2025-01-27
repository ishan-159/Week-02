package problemstatement.onlinefooddelivery;

// Main.java (Demo Class)
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FoodItem> foodItems = new ArrayList<>();

        foodItems.add(new VegItem("Salad", 5.0, 2));
        foodItems.add(new NonVegItem("Chicken Wings", 10.0, 3, 2.0));

        for (FoodItem item : foodItems) {
            System.out.println(item.getItemDetails());
            System.out.println("Total Price (Before Discount): $" + item.calculateTotalPrice());

            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                discountable.applyDiscount(10.0); // Applying 10% discount
                System.out.println(discountable.getDiscountDetails());
                System.out.println("Total Price (After Discount): $" + item.calculateTotalPrice());
            }

            System.out.println("-----------------------");
        }
    }
}