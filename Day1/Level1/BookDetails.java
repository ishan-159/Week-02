class Book{
String title;
String author;
int price;

//Constructor
public Book(String title, String author, int price){
this.title = title;
this.author = author;
this.price = price;
}
public void DisplayBookDetails(){
System.out.println("Book title : " + title);
System.out.println("Author of Book : " + author);
System.out.println("Price of book is : " + price);
}
}

public class BookDetails{
public static void main(String[] args){
Book book1 = new Book("Kashmir Files","Vivek Agnihotri",250);
Book book2 = new Book("Great Expectations","Charles Dickens",200);
System.out.println("Book1");
book1.DisplayBookDetails();
System.out.println("Book2");
book2.DisplayBookDetails();
}
}