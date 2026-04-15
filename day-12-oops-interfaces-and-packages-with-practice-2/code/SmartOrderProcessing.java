/* 
Problem statement

Design a Smart Order Processing System for a small store.

The system should support:

Order types
RegularOrder
ExpressOrder
Payment methods
UPIPayment
CardPayment
CashPayment
Features

Each order should:

have an orderId
have customerName
have amount
have a status

Each order should follow this flow:

validate order
apply charges / rules
make payment
mark order as processed
Rules
Common validation
customer name cannot be empty
amount must be positive
Order-specific behavior
RegularOrder → no extra charge
ExpressOrder → extra delivery charge added
Payment-specific behavior
UPI → prints "Paid X using UPI"
Card → prints "Paid X using Card"
Cash → prints "Paid X using Cash"
Final processing message

After successful processing:

status becomes PROCESSED
print:
Order <id> processed successfully
*/

/*
Requirements:
1) Create a smart order processing system than can handle different types of orders and payment methods.
2) Each order should have a unique ID, customer name, amount, and status.
3) There are two types of orders: RegularOrder and ExpressOrder. ExpressOrder adds a fixed delivery charge to the final payable amount.
4) There are three payment methods: UPIPayment, CardPayment, and CashPayment. Each payment method should print a specific message when payment is made.
5) The system should validate the order details before processing. 
    - Customer name cannot be empty or null.
    - Amount must be positive.
6) After successful processing, 
    - payment should be completed using the chosen payment method.
    - order status should be updated to PROCESSED.
    - a success message should be printed: "Order <id> processed successfully".
*/

/*
Entities and their relationships:
1) Order
    - orderId (String)
    - customerName (String)
    - amount (double)
    - status (enum: CREATED, PROCESSED)
    - boolean validate() - method to validate order details
    - paymentMethod (PaymentMethod)
    - final void processOrder() - method to process the order, which includes validation, applying charges/rules, making payment, and marking order as processed
    - abstract double applyExtraCharges() - method to apply extra charges based on order type (overridden in ExpressOrder)

        - Order Has-A PaymentMethod, which means each order will have a reference to a payment method that will be used to process the payment.
        This is a composition relationship, as the payment method is an integral part of the order processing. The order cannot be processed without a payment method, and the payment method is specific to each order.

As there are two types RegularOrder and ExpressOrder, we can create an abstract class Order and then extend it for both types.

2) RegularOrder (extends Order)
    - No additional fields or methods

3) ExpressOrder (extends Order)
    - deliveryCharge (double) - fixed charge for express delivery

4) PaymentMethod 
    - pay(double amount) - method to process payment, implemented by specific payment types
As there are three payment methods UPIPayment, CardPayment, and CashPayment, we can create an interface PaymentMethod and then implement it for each payment type.

5) UPIPayment (implements PaymentMethod)
    - pay(double amount) - prints "Paid X using UPI"

6) CardPayment (implements PaymentMethod)
    - pay(double amount) - prints "Paid X using Card"

7) CashPayment (implements PaymentMethod)
    - pay(double amount) - prints "Paid X using Cash"

*/

/*
Implementation details:
1) Create an abstract class Order with common fields and methods for both RegularOrder and ExpressOrder.
    It should have a constructor which initializes orderId, customerName, amount, and paymentMethod. The status for the order should be initialized to CREATED.
2) Create RegularOrder and ExpressOrder classes that extend Order. ExpressOrder will override the applyExtraCharges method to add a delivery charge.
3) Create a PaymentMethod interface with a pay method, and implement this interface in UPIPayment, CardPayment, and CashPayment classes.
4) In the processOrder method of the Order class, implement the flow of validating the order, applying extra charges, making payment, and updating the status to PROCESSED.
  if validation fails -> stop
  calculate final amount (base amount + extra charges)
  paymentMethod.pay(final amount)
  status = PROCESSED
  print success message 
5) In the main method, create instances of RegularOrder and ExpressOrder with different payment methods, and call the processOrder method to demonstrate the functionality of the system.
*/



enum OrderStatus {
    CREATED,
    PROCESSED
}

interface PaymentMethod {
    void pay(double amount);
}

class UPIPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class CardPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Card");
    }
}

class CashPayment implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Cash");
    }
}

abstract class Order{
    private  String orderId;
    private  String customerName;
    private  double amount;
    private OrderStatus status;
    private PaymentMethod paymentMethod;

    public Order(String orderId, String customerName, double amount, PaymentMethod paymentMethod) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.status = OrderStatus.CREATED;
    }

    public String getOrderId() {
        return orderId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public double getAmount() {
        return amount;
    }
    public OrderStatus getStatus() {
        return status;
    }

    public boolean validate(){
        if(customerName==null || customerName.isEmpty()){
            System.out.println("Validation failed: Customer name cannot be empty");
            return false;
        }
        if(amount <= 0){
            System.out.println("Validation failed: Amount must be positive");
            return false;
        }
        if(paymentMethod == null){
            System.out.println("Validation failed: Payment method cannot be null");
            return false;
        }
        return true;
    }

    public final void processOrder(){
        if(status==OrderStatus.PROCESSED){
            System.out.println("Order " + orderId + " is already processed");
            return;
        }
        if(!validate()){
            return;
        }
        double finalAmount = amount + applyExtraCharges();
        paymentMethod.pay(finalAmount);
        status = OrderStatus.PROCESSED;
        System.out.println("Order " + orderId + " processed successfully");
    }

    protected abstract double applyExtraCharges();
}

class RegularOrder extends Order {
    public RegularOrder(String orderId, String customerName, double amount, PaymentMethod paymentMethod) {
        super(orderId, customerName, amount, paymentMethod);
    }

    @Override
    protected double applyExtraCharges() {
        return 0; // No extra charge for regular orders
    }
}

class ExpressOrder extends Order {
    private static final double DELIVERY_CHARGE = 50.0;

    public ExpressOrder(String orderId, String customerName, double amount, PaymentMethod paymentMethod) {
        super(orderId, customerName, amount, paymentMethod);
    }

    @Override
    protected double applyExtraCharges() {
        return DELIVERY_CHARGE;
    }
}

public class SmartOrderProcessing {
    public static void main(String[] args) {
        RegularOrder regularOrder = new RegularOrder("R001", "Alice", 100.0, new UPIPayment());

        ExpressOrder expressOrder = new ExpressOrder("E001", "Bob", 150.0, new CardPayment());

        regularOrder.processOrder();
        expressOrder.processOrder();

    }
}
