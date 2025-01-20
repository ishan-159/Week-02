class Books{
    //Attributes
    String title;
    String author;
    int price;
    //Default Constructor
    Books(){
      title = "Lords of the ring";
      author = "John Ronald Reuel Tolkien";
      price = 1771;
    }
    //Parametrized Constructor
    Books(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void DisplayDetails(){
        System.out.println("Title of the book : " + title);
        System.out.println("Author of the book : " + author);
        System.out.println("Price of the book : " + price);
    }
}

public class Book {
    public static void main(String[] args) {
        Books book1 = new Books("Harry Potter","J.K. Rowling",250);
        Books book2 = new Books("Harry Potter and the cursed child","J.K. Rowling",280);
        System.out.println("---------------Book 1---------------");
        book1.DisplayDetails();
        System.out.println("---------------Book 2---------------");
        book2.DisplayDetails();
    }
}
