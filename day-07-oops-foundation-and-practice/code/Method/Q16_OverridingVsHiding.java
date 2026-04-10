// This code demonstrates the concept of method overriding and method hiding in Java. The Animal class has a static method staticMethod() and an instance method instanceMethod(). The Dog class extends Animal and provides its own implementations of both methods. In the main method, we create an instance of Dog but reference it as an Animal. When we call the static method, it will call the version defined in the Animal class due to method hiding, while calling the instance method will invoke the version defined in the Dog class due to method overriding.

// Static methods are resolved at compile time using the reference type,
// so Animal.staticMethod() is called.
// Instance methods are resolved at runtime using the actual object,
// so Dog.instanceMethod() is called.

// Output:
// Animal static
// Dog instance

class Animal {
    static void staticMethod() {
        System.out.println("Animal static");
    }

    void instanceMethod() {
        System.out.println("Animal instance");
    }
}

class Dog extends Animal {
    static void staticMethod() {
        System.out.println("Dog static");
    }

    void instanceMethod() {
        System.out.println("Dog instance");
    }
}

public class Q16_OverridingVsHiding {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.staticMethod(); // This will call the static method of Animal, not Dog
        animal.instanceMethod(); // This will call the instance method of Dog, not Animal
    }
}
