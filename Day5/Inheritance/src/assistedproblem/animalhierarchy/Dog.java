package assistedproblem.animalhierarchy;

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age); // Call the constructor of the superclass
    }
    public void makeSound() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}


