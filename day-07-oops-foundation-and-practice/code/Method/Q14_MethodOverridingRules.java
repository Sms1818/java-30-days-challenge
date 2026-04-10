// This code demonstrates that we cannot override a method with a more restrictive access modifier. In this example, the Dog class attempts to override the sound() method from the Animal class, but if we make the sound() method in Dog private, it will cause a compilation error because it cannot be accessed from outside the Dog class. To successfully override the method, it must have the same or a less restrictive access modifier (e.g., public or protected) than the method in the superclass (Animal).

// Output:
// Dog sound

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    // private void sound() {
    //     System.out.println("Dog sound");
    // }
    void sound() {
        System.out.println("Dog sound");
    }
}

public class Q14_MethodOverridingRules {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound(); // This will call the sound method of Dog, not Animal, because Dog overrides the method. The output will be "Dog sound".
    }
}