// In this code, we demonstrate method overloading and ambiguity in Java. The Q10_OverloadingAmbiguity class has two overloaded display methods that accept different parameter types: one takes an int and a double, while the other takes a double and an int. In the main method, we create an instance of Q10_OverloadingAmbiguity and call the display method with different arguments to show how Java resolves method calls based on the argument types.

// When we call obj.display(10, 20.5), it matches the display(int a, double b) method directly. When we call obj.display(20.5, 10), it matches the display(double a, int b) method directly. However, when we call obj.display(10, 10), both methods are equally valid for the given arguments (10 can be promoted to double and 10 can be treated as int), which causes an ambiguity error at compile time.

// Output:
 // Method with int and double parameters: 10, 20.5
 // Method with double and int parameters: 20.5, 10
 // The last line is commented out because it will cause an ambiguity error due to both methods being equally valid for the given arguments (10, 10).

public class Q10_OverloadingAmbiguity {
    public void display(int a, double b) {
        System.out.println("Method with int and double parameters: " + a + ", " + b);
    }
    public void display(double a, int b) {
        System.out.println("Method with double and int parameters: " + a + ", " + b);
    }
    public static void main(String[] args) {
        Q10_OverloadingAmbiguity obj = new Q10_OverloadingAmbiguity();
        obj.display(10, 20.5); // Calls display(int a, double b)
        obj.display(20.5, 10); // Calls display(double a, int b)
        //obj.display(10, 10); // This will cause ambiguity error
    }
}
