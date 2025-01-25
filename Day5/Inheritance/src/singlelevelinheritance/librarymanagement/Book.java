package singlelevelinheritance.librarymanagement;

class Book{
    String title;
    int publicationYear;
    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
    public void displayDetails(){
        System.out.println("Title of the book : " + title);
        System.out.println("Publication year of the book : " + publicationYear);
    }
}

