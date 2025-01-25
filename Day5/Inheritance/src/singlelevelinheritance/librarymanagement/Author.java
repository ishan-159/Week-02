package singlelevelinheritance.librarymanagement;


class Author extends Book{
    String name;
    String bio;
    Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);//call the superclass constructor
        this.name = name;
        this.bio = bio;
    }
    public void display(){
        super.displayDetails();//call the superclass method
        System.out.println("Author name : " + name);
        System.out.println("Bio : " + bio);
    }
}
