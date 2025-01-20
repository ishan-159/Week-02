class Products {
     String productName;
     double price;
     static int totalProducts = 0; // Class variable to track total products

    // Constructor
    Products(String name, double price) {
        this.productName = name;
        this.price = price;
        totalProducts++; // Increment total products when a new product is created
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Class method to display total products
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}
public class Product{
    public static void main(String[] args) {
        // Creating products
        Products product1 = new Products("Laptop", 800.00);
        Products product2 = new Products("Smartphone", 500.00);

        // Displaying product details
        System.out.println("Product 1 Details:");
        product1.displayProductDetails();

        System.out.println("Product 2 Details:");
        product2.displayProductDetails();

        // Displaying total products
        System.out.println("Total Products Created:");
        Products.displayTotalProducts();
    }
}
