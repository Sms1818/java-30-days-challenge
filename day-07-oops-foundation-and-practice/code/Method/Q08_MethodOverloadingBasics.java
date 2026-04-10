// This code demonstrates method overloading in Java. The Calculator class has three methods named addValues, each with different parameter types and counts. The main method creates an instance of the Calculator class and calls each of the overloaded methods, printing their results to the console. The method to be called is determined at compile time based on the number and types of arguments passed.


// Output:
// 5
// 6.0
// 6

class Calculator {
    public int addValues(int a, int b) {
        return a + b;
    }

    public double addValues(double a, double b) {
        return a + b;
    }

    public int addValues(int a, int b, int c) {
        return a + b + c;
    }
}

public class Q08_MethodOverloadingBasics {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.addValues(2, 3));
        System.out.println(calc.addValues(2.5, 3.5));
        System.out.println(calc.addValues(1, 2, 3));
    }
}