// In this code, we demonstrate deep copy using copy constructors.

// ======================= MEMORY UNDERSTANDING =======================

// Step 1:
// Person p1 = new Person("John", new Address("Pune"));

// Stack:                     Heap:
// p1  ───────────────▶   [Person object]
//                          name = "John"
//                          address ─────────▶ [Address object]
//                                               city = "Pune"


// Step 2:
// Person p2 = new Person(p1);

// Copy constructor runs:

// this.name = p.name;              (copy value)
// this.address = new Address(p.address);  (🔥 deep copy happens here)

// Now memory becomes:

// Stack:                     Heap:
// p1  ───────────────▶   [Person object 1]
//                          name = "John"
//                          address ─────────▶ [Address A]
//                                               city = "Pune"

// p2  ───────────────▶   [Person object 2]
//                          name = "John"
//                          address ─────────▶ [Address B]
//                                               city = "Pune"

// 👉 IMPORTANT:
// Address A and Address B are DIFFERENT objects


// Step 3:
// p2.address.city = "Mumbai";

// Now:

// p1.address.city = "Pune"   ✅ (unchanged)
// p2.address.city = "Mumbai"


// ======================= WHY COPY CONSTRUCTOR FOR ADDRESS? =======================

// If we DID NOT create copy constructor:

// this.address = p.address;

// Then memory would be:

// p1.address ─────┐
//                 ├──▶ SAME Address object ❌
// p2.address ─────┘

// Changing p2 would also change p1 (WRONG for deep copy)


// ======================= CODE =======================

class Address {
    String city;

    public Address(String city) {
        this.city = city;
    }

    // Copy constructor (deep copy support)
    public Address(Address a) {
        this.city = a.city;
    }
}

class Person {
    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Deep copy constructor
    public Person(Person p) {
        this.name = p.name;
        this.address = new Address(p.address); // 🔥 creates NEW Address object
    }
}

public class Q06_DeepCopyConstructor {
    public static void main(String[] args) {
        Person p1 = new Person("John", new Address("Pune"));
        Person p2 = new Person(p1);

        p2.address.city = "Mumbai";

        System.out.println("Person 1 Name: " + p1.name);
        System.out.println("Person 1 City: " + p1.address.city);

        System.out.println("Person 2 Name: " + p2.name);
        System.out.println("Person 2 City: " + p2.address.city);
    }
}