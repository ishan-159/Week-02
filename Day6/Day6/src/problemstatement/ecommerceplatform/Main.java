package problemstatement.ecommerceplatform;


import java.util.ArrayList;
import java.util.List;

public class Main {

    //method to calculate and print final price
    public static void calculateFinalPrice(List<Product> products) {
        for (Product product : products) {
            double discount = product.calculateDiscount();
            double  tax = ((Taxable) product).calculateTax();

            double finalPrice = product.getPrice() + tax - discount;
            System.out.println("Product :"+product.getName());
            System.out.println("Final price : "+finalPrice);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        Electronics e = new Electronics(501,"IPhone",55000);
        Clothing c = new Clothing(202,"Shirt",950);
        Groceries g = new Groceries(303,"Vegetables",433);

        products.add(e);
        products.add(c);
        products.add(g);

        calculateFinalPrice(products);

    }
}

