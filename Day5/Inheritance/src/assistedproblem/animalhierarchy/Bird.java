package assistedproblem.animalhierarchy;

class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age); // Call the constructor of the superclass
    }

    public void makeSound() {
        System.out.println("Bird chirps: Tweet! Tweet!");
    }
}

