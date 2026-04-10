// This code demonstrates static method hiding in Java. The Animal class has a static method named sound, and the Dog class extends Animal and also has a static method with the same name. In the main method, we create an instance of Dog but reference it as an Animal. When we call the sound method on the animal reference, it calls the sound method of the Animal class, not the Dog class, because static methods are resolved at compile time based on the reference type. When we call the sound method on the dog reference, it calls the sound method of the Dog class.

// Static methods are not overridden, they are hidden.
// Method calls are resolved at compile time based on the reference type,
// not the actual object type.
// Therefore, Animal reference calls Animal's static method.

// Output:
// Animal sound
// Dog sound

class Animal {
    static void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    static void sound() {
        System.out.println("Dog sound");
    }
}

public class Q15_StaticMethodHiding {
    
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound(); // This will call the sound method of Animal, not Dog
        Dog dog = new Dog();
        dog.sound(); // This will call the sound method of Dog
    }
}
