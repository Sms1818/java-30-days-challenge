// This program demonstrates the use of a copy constructor in Java. The Book class has a copy constructor that takes another Book object as a parameter and initializes the new object's fields with the values from the passed object. In the main method, we create a Book object b1 with a title and price, and then we create another Book object b2 using the copy constructor by passing b1. Finally, we print the title and price of both books to the console to verify that they have the same values.

// By copy constructor, we can reuse the constructor which makes code more readable and maintainable.

// Output
// Book 1 Title: Java Programming
// Book 1 Price: 500
// Book 2 Title: Java Programming
// Book 2 Price: 500
class Book {
    String title;
    int price;
    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }
    public Book(Book b){
        this.title = b.title;
        this.price = b.price;
    }
}

public class Q05_CopyConstructor {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", 500);
        Book b2 = new Book(b1); 
        System.out.println("Book 1 Title: " + b1.title);
        System.out.println("Book 1 Price: " + b1.price);
        System.out.println("Book 2 Title: " + b2.title);
        System.out.println("Book 2 Price: " + b2.price);
    }
}