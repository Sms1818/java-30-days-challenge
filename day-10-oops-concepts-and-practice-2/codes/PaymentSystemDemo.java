/*
Problem: 

Design a Payment System.

🔹 Requirements

You need to support multiple payment types:

Credit Card
UPI
PayPal
🔹 Each payment should:

Have a method:

void pay(double amount);
Print different messages:
CreditCard → "Paid X using Credit Card"
UPI → "Paid X using UPI"
PayPal → "Paid X using PayPal"
🔹 In main:

Create a method:

processPayment(Payment p, double amount)

Call:

processPayment(new CreditCard(), 1000);
processPayment(new UPI(), 500);
processPayment(new PayPal(), 800);
*/

// Solution: My intuition is to use an interface for Payment which will act as a contract having abstract method pay() which has to implemented by the classes CreditCard, UPI and PayPal. Each class will provide its own implementation of the pay() method to print the respective messages. The processPayment() method will take a Payment object and an amount, and call the pay() method on the Payment object to process the payment.

// Output :
// Paid 1000.0 using Credit Card
// Paid 500.0 using UPI
// Paid 800.0 using PayPal
interface Payment{
    void pay(double amount);
}
class CreditCard implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paid "+amount+" using Credit Card");
    }
}
class UPI implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paid "+amount+" using UPI");
    }
}
class PayPal implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paid "+amount+" using PayPal");
    }
}
public class PaymentSystemDemo {
    static void processPayment(Payment p, double amount){
        if(amount<=0){
            System.out.println("Amount must be positive.");
            return;
        }
        p.pay(amount);
    }
    public static void main(String[] args) {
        processPayment(new CreditCard(), 1000);
        processPayment(new UPI(), 500);
        processPayment(new PayPal(), 800);
        
    }
}
