package assistedproblem.animalhierarchy;

public class Main {
    public static void main(String[] args) {
        // Create a Dog object
        Dog dog = new Dog("Buddy", 3);
        System.out.println("Dog Details");
        dog.displayDetails();
        dog.makeSound();

        // Create a Cat object
        Cat cat = new Cat("Whiskers", 2);
        System.out.println("Cat Details");
        cat.displayDetails();
        cat.makeSound();

        // Create a Bird object
        Bird bird = new Bird("Tweety", 1);
        System.out.println("Bird Details");
        bird.displayDetails();
        bird.makeSound();
    }
}

