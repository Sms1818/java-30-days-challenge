// This code demonstrates method overriding in Java. The Animal class has a method makeSound(), which is overridden by the Dog class to provide a specific implementation. In the main method, we create instances of both Animal and Dog, and call the makeSound() method on each. Additionally, we create an instance of Dog but reference it as an Animal to show that the overridden method in Dog is called, demonstrating polymorphism.

// Method overriding is resolved at runtime (dynamic method dispatch).
// Even though the reference type is Animal, the actual object is Dog.
// Therefore, the overridden method in Dog is executed.

// Output:
// Animal makes a sound
// Dog barks
// Dog barks



class Animal {
        public void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }
    class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("Dog barks");
        }
    }
public class Q13_MethodOverridingBasics {
    
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.makeSound(); // Output: Animal makes a sound
        dog.makeSound();    // Output: Dog barks

        Animal dog1=new Dog();
        dog1.makeSound();    // Output: Dog barks
    }
}
