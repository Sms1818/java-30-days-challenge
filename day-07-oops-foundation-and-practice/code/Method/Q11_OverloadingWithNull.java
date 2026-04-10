// This code demonstrates method overloading in Java with null values. The Q11_OverloadingWithNull class has two overloaded print methods: one that takes a String parameter and another that takes an Object parameter. In the main method, both methods are called with null values, and the output shows that both calls result in "null" being printed to the console. The last call to print(null),Java resolves it to the most specific method, which is the one that takes a String parameter.

// Why?

// Because Java chooses the most specific method

// Hierarchy:
// Object
//    ↑
//  String

// 👉 String is a subclass of Object

// So:

// print(Object) → more general
// print(String) → more specific ✅

// 👉 Java picks print(String)

// Output:
// null
// null
// null

public class Q11_OverloadingWithNull {
    public void print(String s){
        System.out.println(s);
    }
    public void print(Object o){
        System.out.println(o);
    }
    public static void main(String[] args) {
        Q11_OverloadingWithNull obj=new Q11_OverloadingWithNull();
        String s=null;
        Object o=null;
        obj.print(s);
        obj.print(o);
        obj.print(null);
        
    }
}
