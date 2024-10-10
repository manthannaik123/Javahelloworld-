// Base class (Grandparent)
class Animal {
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class (Parent)
class Mammal extends Animal {
    public void move() {
        System.out.println("This mammal moves.");
    }
}

// Derived class (Child)
class Dog extends Mammal {
    public void bark() {
        System.out.println("The dog barks.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        // Create an object of Dog class
        Dog dog = new Dog();

        // Calling methods from Dog, Mammal, and Animal classes
        dog.eat();  // Method of Animal class
        dog.move(); // Method of Mammal class
        dog.bark(); // Method of Dog class
    }
