class MobilePhone{
    //Attributes
    String brand;
    String model;
    int price;

    //Constructor to initialize attributes
    public MobilePhone(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    //Display all the details
    public void DisplayDetails(){
        System.out.println("Brand Name : " + brand);
        System.out.println("Model Name : " + model);
        System.out.println("Price of the Mobile Phone : " + price);
    }
}

public class MobileNumber {
    public static void main(String[] args) {
        //Create object of MobilePhone
        MobilePhone mobile1 = new MobilePhone("Vivo","Promodel",24000);
        MobilePhone mobile2 = new MobilePhone("Iphone","Fifteen",63000);
        System.out.println("Mobile One Details");
        mobile1.DisplayDetails();
        System.out.println("Mobile Two Details");
        mobile2.DisplayDetails();
    }
}
