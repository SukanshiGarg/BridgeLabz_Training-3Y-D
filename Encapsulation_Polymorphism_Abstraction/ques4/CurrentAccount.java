// File: CurrentAccount.java
public class CurrentAccount extends BankAccount implements Loanable {
    private double interestRate = 0.02; // 2% interest

    public CurrentAccount(String accNo, String holder, double balance) {
        super(accNo, holder, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * interestRate;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Loan of ₹" + amount + " applied for Current Account.");
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000; // Eligible if balance ≥ 10000
    }
}
