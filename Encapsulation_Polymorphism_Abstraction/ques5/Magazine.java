/*
 Subclass: Magazine (Problem 5: Library Management System)
 Loan duration: 7 days
*/

public class Magazine extends LibraryItem implements Reservable {
    private String borrower;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 7; // Magazines can be borrowed for 7 days
    }

    @Override
    public void reserveItem(String borrower) {
        if (isAvailable()) {
            setAvailable(false);
            this.borrower = borrower;
            System.out.println("Magazine reserved by: " + borrower);
        } else {
            System.out.println("Magazine not available for reservation.");
        }
    }

    @Override
    public void checkAvailability() {
        System.out.println("Magazine availability: " + (isAvailable() ? "Available ✅" : "Not Available ❌"));
    }
}

