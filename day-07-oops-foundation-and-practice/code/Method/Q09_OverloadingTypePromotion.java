// In this code, we demonstrate method overloading and type promotion in Java. The Q09_OverloadingTypePromotion class has three overloaded display methods that accept different parameter types: int, short, and double. In the main method, we create an instance of Q09_OverloadingTypePromotion and call the display method with different arguments to show how Java promotes types to match the appropriate method signature.

// When we call obj.display(10), it matches the display(int a) method directly. When we call obj.display(10.5), it matches the display(double a) method directly. When we call obj.display('A'), the char 'A' is implicitly converted to its corresponding int value (65) and matches the display(int a) method.

// When we call the display(10), it took int as a parameter and not short because 10 is an int literal. If we want to call the display(short a) method, we would need to explicitly cast the value to short like this: obj.display((short)10).

// Output:
// Integer: 10
// Double: 10.5
// Integer: 65

public class Q09_OverloadingTypePromotion {
    public void display(int a){
        System.out.println("Integer: "+a);
    }
    public void display(short a){
        System.out.println("Short: "+a);
    }
    public void display(double a){
        System.out.println("Double: "+a);
    }

    public static void main(String[] args) {
        Q09_OverloadingTypePromotion obj = new Q09_OverloadingTypePromotion();
        obj.display(10); // Calls display(int a)
        obj.display(10.5); // Calls display(double a)
        obj.display('A'); // char is promoted to int, calls display(int a)
    }
}
