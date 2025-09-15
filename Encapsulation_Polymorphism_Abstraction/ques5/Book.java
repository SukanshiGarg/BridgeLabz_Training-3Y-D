/*
 Subclass: Book (Problem 5: Library Management System)
 Loan duration: 14 days
*/

public class Book extends LibraryItem implements Reservable {
    private String borrower;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // Books can be borrowed for 14 days
    }

    @Override
    public void reserveItem(String borrower) {
        if (isAvailable()) {
            setAvailable(false);
            this.borrower = borrower;
            System.out.println("Book reserved by: " + borrower);
        } else {
            System.out.println("Book not available for reservation.");
        }
    }

    @Override
    public void checkAvailability() {
        System.out.println("Book availability: " + (isAvailable() ? "Available ✅" : "Not Available ❌"));
    }
}

