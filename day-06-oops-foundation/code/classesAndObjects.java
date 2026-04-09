// Java Object & Reference Behavior - Interview Practice
// Add this file to your GitHub as revision notes

class Test1 {
    int x = 10;
    Test1() {
        x = 20;
    }
}

class Test2 {
    int x = 10;
    {
        x = 30; // instance initializer block
    }
    Test2() {
        x = 20;
    }
}

class Test3 {
    static int x = 10;
    Test3() {
        x++;
    }
}

class Test4 {
    int x = 10;
    void modify(Test4 t) {
        t.x = 50; // modifies same object
    }
}

class Test5 {
    int x = 10;
}

class Test6 {
    int x = 10;
    void show() {
        System.out.println("Hello");
    }
}

class Test7 {
    static int x = 10;
}

class Test8 {
    {
        System.out.println("Block");
    }
    Test8() {
        System.out.println("Constructor");
    }
}

class Test9 {
    static void show() {
        System.out.println("Static");
    }
}

class Test10 {
    int x = 10;
}

public class classesAndObjects {

    // Q1
    static void q1() {
        Test1 t = new Test1();
        System.out.println(t.x); // Output: 20
        // Reason: constructor overrides instance variable
    }

    // Q2
    static void q2() {
        Test2 t = new Test2();
        System.out.println(t.x); // Output: 20
        // Order: instance var -> block -> constructor
    }

    // Q3
    static void q3() {
        Test3 t1 = new Test3();
        Test3 t2 = new Test3();
        System.out.println(t1.x + " " + t2.x); // Output: 12 12
        // Static variable shared and incremented twice
    }

    // Q4
    static void q4() {
        Test4 t1 = new Test4();
        Test4 t2 = new Test4();
        t1.modify(t2);
        System.out.println(t2.x); // Output: 50
        // Same object reference modified
    }

    // Q5
    static void q5() {
        Test5 t1 = new Test5();
        Test5 t2 = t1;
        t2.x = 50;
        System.out.println(t1.x); // Output: 50
        // Both references point to same object
    }

    // Q6
    static void q6() {
        Test6 t = null;
        // System.out.println(t.x);
        // Runtime Error: NullPointerException
    }

    // Q7
    static void q7() {
        Test7 t = null;
        System.out.println(t.x); // Output: 10
        // Static variable accessed via class
    }

    // Q8
    static void q8() {
        new Test8();
        // Output:
        // Block
        // Constructor
    }

    // Q9
    static void q9() {
        Test9 t = null;
        t.show(); // Output: Static
        // Static method call resolved at class level
    }

    // Q10 (IMPORTANT)
    static void change(Test10 t) {
        t = new Test10(); // new object (local)
        t.x = 50;
    }

    static void q10() {
        Test10 t = new Test10();
        change(t);
        System.out.println(t.x); // Output: 10
        // Java pass-by-value: reference copy is passed
    }

    public static void main(String[] args) {
        q1();
        q2();
        q3();
        q4();
        q5();
        q6();
        q7();
        q8();
        q9();
        q10();
    }
}
