// File: Main.java
public class Main {
    public static void processAccount(BankAccount account) {
        account.displayAccountDetails();
        double interest = account.calculateInterest();
        System.out.println("Interest Earned: ₹" + interest);

        if (account instanceof Loanable) {
            Loanable loanable = (Loanable) account;
            loanable.applyForLoan(20000);
            System.out.println("Loan Eligibility: " + (loanable.calculateLoanEligibility() ? "Eligible ✅" : "Not Eligible ❌"));
        }

        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("SAV123", "Amit Sharma", 8000);
        BankAccount acc2 = new CurrentAccount("CUR456", "Neha Gupta", 12000);

        // Polymorphism in action
        processAccount(acc1);
        processAccount(acc2);

        // Extra operations
        acc1.deposit(2000);
        acc2.withdraw(5000);            
    }
}

