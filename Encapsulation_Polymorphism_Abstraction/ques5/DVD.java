/*
 Subclass: DVD (Problem 5: Library Management System)
 Loan duration: 3 days
*/

public class DVD extends LibraryItem implements Reservable {
    private String borrower;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // DVDs can be borrowed for 3 days
    }

    @Override
    public void reserveItem(String borrower) {
        if (isAvailable()) {
            setAvailable(false);
            this.borrower = borrower;
            System.out.println("DVD reserved by: " + borrower);
        } else {
            System.out.println("DVD not available for reservation.");
        }
    }

    @Override
    public void checkAvailability() {
        System.out.println("DVD availability: " + (isAvailable() ? "Available ✅" : "Not Available ❌"));
    }
}

