
import java.util.ArrayList;

//Class Book
class Book{
   String title;
   String author;

   //Parameterized Constructor
   Book(String title, String author){
       this.title = title;
       this.author = author;
   }

   //Creating a method to display the details
   public void DisplayDetails(){
       System.out.println("Title : " + title);
       System.out.println("Author : " + author);
   }
}

//Class Library
class Library{
   String name;
   ArrayList<Book> books;

   //Constructor
   Library(String name){
       this.name = name;
       this.books = new ArrayList<>();
   }
   public void AddBooks(Book book){
       books.add(book);
   }
   public void DisplayBooks(){
       System.out.println("Books in " + name + " Library : ");
       for(Book book : books){
           book.DisplayDetails();
       }
   }
}
public class LibraryAndBooks{
   public static void main(String[] args){
//Creating Book Objects
       Book book1 = new Book("R.D. Sharma", "R.D. Sharma");
       Book book2 = new Book("H.C. Verma", "Harish Chandra Verma");
       Book book3 = new Book("The Story of Success", "Malcolm Gladwell");
       Book book4 = new Book("India Wins Freedom", "Abdul Kalam Azad");

//Creating Library Objects
       Library lib1 = new Library("Turning Point");
       Library lib2 = new Library("Krishna Library");

       lib1.AddBooks(book1);
       lib1.AddBooks(book2);

       lib2.AddBooks(book3);
       lib2.AddBooks(book4);

       lib1.DisplayBooks();
       lib2.DisplayBooks();
   }
}

