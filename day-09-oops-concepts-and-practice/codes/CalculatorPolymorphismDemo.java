/*
Problem 

Create a base class:

class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}
Subclass

Create AdvancedCalculator that:

✔ Overrides:
int add(int a, int b)
Return: a + b + 10
✔ Overloads:
int add(int a, int b, int c)
Return: a + b + c
*/

// Important concept here to understand is if the method is there in base class but not there in super class and if we create reference type of super class, it will give an compilation error of not having that method in super class.
// A method must be present in the reference type for the code to compile, even if it exists in the object type.

// Output
// 15
// 15
// 9

class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}

class AdvancedCalculator extends Calculator{
    @Override
    public int add(int a, int b){
        return a+b+10;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }
}

public class CalculatorPolymorphismDemo {
    public static void main(String[] args) {
        Calculator c=new AdvancedCalculator();
        System.out.println(c.add(2,3));
        // System.out.println(c.add(2,3,4)); It will not compile as Calculator class doesnt have the method which takes 3 argument a, b and c. So it gives a compilation error.

        AdvancedCalculator c1=new AdvancedCalculator();
        System.out.println(c1.add(2, 3));
        System.out.println(c1.add(2,3,4));

    }
}