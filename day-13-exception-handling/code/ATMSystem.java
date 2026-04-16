class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class ATMAccount {
    private String accountNumber;
    private double balance;

    public ATMAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal.");
        }
        balance -= amount;
    }
}

class ATM {
    private ATMAccount account;

    public ATM(ATMAccount account) {
        this.account = account;
    }

    public void deposit(double amount) {
        try {
            account.deposit(amount);
            System.out.println("Deposit successful. Balance: " + account.getBalance());
        } catch (InvalidAmountException e) {
            System.out.println("Deposit failed: " + e.getMessage());
        }
    }

    public void withdraw(double amount) {
        try {
            account.withdraw(amount);
            System.out.println("Withdrawal successful. Balance: " + account.getBalance());
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + account.getBalance());
    }
}

public class ATMSystem {
    public static void main(String[] args) {
        ATMAccount account = new ATMAccount("123456789", 1000.0);
        ATM atm = new ATM(account);

        atm.checkBalance();
        atm.deposit(500);
        atm.deposit(-100);
        atm.withdraw(200);
        atm.withdraw(1500);
        atm.checkBalance();
    }
}