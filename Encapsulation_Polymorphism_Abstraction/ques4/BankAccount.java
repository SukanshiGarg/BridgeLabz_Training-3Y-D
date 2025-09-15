// File: BankAccount.java
public abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Encapsulation (getters & setters)
    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount + " | New Balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount + " | Remaining Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount!");
        }
    }

    // Abstract method
    public abstract double calculateInterest();

    // Concrete method
    public void displayAccountDetails() {
        System.out.println("Account: " + accountNumber + " | Holder: " + holderName + " | Balance: ₹" + balance);
    }
}


