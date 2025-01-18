class Item{
String itemCode;
String itemName;
double price;
int quantity;

public Item(int itemCode, String itemName, int price, int quantity){
this.itemCode = itemCode;
this.itemName = itemName;
this.price = price;
this.quantity = quantity;
}
public double TotalCost(){
return price*quantity;
}
public void DisplayItems(){
System.out.println("Item Code : " + itemCode);
System.out.println("Item Name : " + itemName);
System.out.println("Price of the item : " + price);
System.out.println("Quantity of the item : " + quantity);
System.out.println("Total Price : " + TotalCost);
}
}

public class TrackInventory{
public static void main(String[] args){
Item item1 = new Item("I-015","Sugar",50,200);
System.out.println("Item1");
item1.DisplayItems();
}
}