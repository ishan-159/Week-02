
class Person{
    //Attributes
    String name;
    int age;
    //Parameterized Constructor
    Person(String name , int age ){
        this.name = name;
        this.age = age;
    }
    //Copy Constructor
    Person(Person lastPerson){
        this.name = name;
        this.age = age;
    }

//Method to  display the details
    public void DisplayDetails(){

        System.out.println("Name :  "+name);
        System.out.println("age :  "+age);
    }
}

public class PersonDetails
{
    public static void main(String[] args) {

        // Create Circle objects
        Person person1 = new Person("Ishan",22);
        Person person2  = new Person(person1);

        // Display the area and circumference of the circle.
        System.out.println("=== Person 1 ===");
        person1.DisplayDetails();
        System.out.println("=== Person 2 ===");
        person1.DisplayDetails();

    }
}