/*
Problem (Encapsulation)
Create a Java program that demonstrates proper encapsulation.
Requirements:
Create a class BankAccount
Make balance private
Provide:
getBalance() → to read balance
deposit(double amount) → add money
withdraw(double amount) → withdraw money
Constraints:
1) Do NOT allow negative deposit
2) Do NOT allow withdrawing more than balance
*/

// Implementation of the BankAcount class with encapsulation and a demo class to test its functionality.

// Output
// Balance after deposit: 6000.0
// Balance after withdrawal: 5500.0
// Deposit amount must be positive.
// Withdrawal amount must be positive.


class BankAccount{
    private double balance;
    public BankAccount(double initialBalance){
        if(initialBalance>=0){
            balance=initialBalance;
        }
        else{
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance=0;
        }
    }
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
        }
        else{
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount){
        if(amount<=0){
            System.out.println("Withdrawal amount must be positive.");
        }
        else if(amount>balance){
            System.out.println("Insufficient balance.");
        }
        else{
            balance-=amount;
        }
    }
}
public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account=new BankAccount(5000);
        account.deposit(1000);
        System.out.println("Balance after deposit: "+account.getBalance());
        account.withdraw(500);
        System.out.println("Balance after withdrawal: "+account.getBalance());
        account.deposit(-200); // Invalid deposit
        account.withdraw(-600); // Invalid withdrawal

    }
}