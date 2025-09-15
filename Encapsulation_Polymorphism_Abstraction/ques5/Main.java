/*
 Main Driver Class (Problem 5: Library Management System)
 Demonstrates polymorphism and reservable functionality.
*/

public class Main {
    public static void processLibraryItem(LibraryItem item) {
        item.getItemDetails();
        System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

        if (item instanceof Reservable) {
            Reservable reservable = (Reservable) item;
            reservable.checkAvailability();
            reservable.reserveItem("Rahul Sharma");
            reservable.checkAvailability();
        }

        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        LibraryItem book = new Book("B101", "Java Basics", "James Gosling");
        LibraryItem magazine = new Magazine("M202", "Tech World", "Editorial Team");
        LibraryItem dvd = new DVD("D303", "Inception", "Christopher Nolan");

        // Polymorphism in action
        processLibraryItem(book);
        processLibraryItem(magazine);
        processLibraryItem(dvd);
    }
}

