package assistedproblem.animalhierarchy;

class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age); // Call the constructor of the superclass
    }

    public void makeSound() {
        System.out.println("Cat meows: Meow! Meow!");
    }
}

