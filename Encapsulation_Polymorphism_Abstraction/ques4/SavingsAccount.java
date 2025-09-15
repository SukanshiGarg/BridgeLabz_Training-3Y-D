// File: SavingsAccount.java
public class SavingsAccount extends BankAccount implements Loanable {
    private double interestRate = 0.04; // 4% interest

    public SavingsAccount(String accNo, String holder, double balance) {
        super(accNo, holder, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan of ₹" + amount + " applied for Savings Account.");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 5000; // Eligible if balance ≥ 5000
    }
}

