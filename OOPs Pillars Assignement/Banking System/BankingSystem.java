import java.util.*;

// 🔹 Abstract class BankAccount
abstract class BankAccount {
    private String accountNumber;  // encapsulated
    private String holderName;     // encapsulated
    protected double balance;      // protected to allow subclass access

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Encapsulation: getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Abstract method for interest calculation
    public abstract double calculateInterest();
}

// 🔹 Interface Loanable
interface Loanable {
    void applyForLoan(double amount);
    double calculateLoanEligibility();
}

// 🔹 SavingsAccount class
class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate; // e.g., 4% per year

    public SavingsAccount(String accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate / 100;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan applied for SavingsAccount: " + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        // Simple eligibility: 50% of balance
        return balance * 0.5;
    }
}

// 🔹 CurrentAccount class
class CurrentAccount extends BankAccount implements Loanable {
    private double overdraftLimit; // e.g., 1000

    public CurrentAccount(String accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public double calculateInterest() {
        // Usually, CurrentAccounts earn little/no interest
        return balance * 0.01; // 1% interest
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan applied for CurrentAccount: " + amount);
    }

    @Override
    public double calculateLoanEligibility() {
        // Eligibility based on balance + overdraft
        return balance + overdraftLimit;
    }
}

// 🔹 Main class
public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("S1001", "Alice", 50000, 4));
        accounts.add(new CurrentAccount("C2001", "Bob", 20000, 10000));

        for (BankAccount account : accounts) {
            System.out.println("Account Holder: " + account.getHolderName());
            System.out.println("Account Number: " + account.getAccountNumber());
            System.out.println("Balance: " + account.getBalance());
            System.out.println("Interest: " + account.calculateInterest());

            if (account instanceof Loanable loanable) {  // polymorphism
                System.out.println("Loan Eligibility: " + loanable.calculateLoanEligibility());
                loanable.applyForLoan(10000);
            }
            System.out.println("------------------------------------------------");
        }
    }
}
