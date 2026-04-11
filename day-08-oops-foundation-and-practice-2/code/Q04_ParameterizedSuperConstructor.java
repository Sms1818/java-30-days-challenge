// This program demonstrates the use of a parameterized constructor in a superclass and how to call it from a subclass using the 'super' keyword. The Animal class has a constructor that takes a 'type' parameter, and the Dog class extends Animal and has its own constructor that takes both 'type' and 'breed' parameters. The Dog constructor calls the Animal constructor using 'super(type)' to initialize the 'type' field. When we create a Dog object, it initializes both the type and breed, and we print these values to the console.

// super should be the first statement in a child constructor to call the parent constructor. Parent constructor will be run first, followed by child constructor.

// If we dont explicity mention super keyword, by default java first executes the parent constructor.

// Output:
// Animal constructor called
// Dog constructor called
// Dog Type: Mammal
// Dog Breed: Labrador

class Animal {
    String type;

    Animal(String type) {
        this.type = type;
        System.out.println("Animal constructor called");
    }
}

class Dog extends Animal {
    String breed;

    Dog(String type, String breed) {
        super(type); // Call the superclass constructor to initialize 'type'
        this.breed = breed;
        System.out.println("Dog constructor called");
    }
}

public class Q04_ParameterizedSuperConstructor {
    public static void main(String[] args) {
        Dog d = new Dog("Mammal", "Labrador");
        System.out.println("Dog Type: " + d.type);
        System.out.println("Dog Breed: " + d.breed);

    }
}