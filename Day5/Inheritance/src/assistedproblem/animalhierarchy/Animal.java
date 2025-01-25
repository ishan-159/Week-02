package assistedproblem.animalhierarchy;

class Animal {
    String name;
    int age;

    // Constructor for Animal
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public void makeSound() {

        System.out.println("Animal makes a sound.");
    }
}

