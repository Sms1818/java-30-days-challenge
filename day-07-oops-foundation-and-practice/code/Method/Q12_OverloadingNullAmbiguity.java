// This code demonstrates method overloading in Java and the ambiguity that can arise when passing null as an argument. The Q12_OverloadingNullAmbiguity class has two overloaded print methods, one that takes a String and another that takes an Integer. In the main method, we call both print methods with null values for String and Integer, which works fine. However, if we try to call print(null) without specifying the type, it will cause a compilation error due to ambiguity, as the compiler cannot determine which print method to call.

// Why does this happen?
// Because both String and Integer can accept null as a valid argument, the compiler cannot decide which method to call when print(null) is invoked. This results in an ambiguity error at compile time, as there is no way for the compiler to determine whether to call print(String) or print(Integer). To resolve this ambiguity, you would need to explicitly cast the null value to either String or Integer when calling the print method.

// Output:
 // null
 // null
 // Compilation error due to ambiguity when calling print(null)

public class Q12_OverloadingNullAmbiguity {
    public void print(String s){
        System.out.println(s);
    }
    public void print(Integer i){
        System.out.println(i);
    }

    public static void main(String[] args) {
        Q12_OverloadingNullAmbiguity obj = new Q12_OverloadingNullAmbiguity();
        String s = null;
        Integer i = null;
        obj.print(s);
        obj.print(i);
        //obj.print(null); // This will cause a compilation error due to ambiguity
    }
}
