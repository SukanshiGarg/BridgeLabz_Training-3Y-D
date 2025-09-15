/*
 Problem 5: Library Management System
 Description: Develop a library management system:
 - Use an abstract class LibraryItem with fields like itemId, title, and author.
 - Add an abstract method getLoanDuration() and a concrete method getItemDetails().
 - Create subclasses Book, Magazine, and DVD, overriding getLoanDuration() with specific logic.
 - Implement an interface Reservable with methods reserveItem() and checkAvailability().
 - Apply encapsulation to secure details like the borrower’s personal data.
 - Use polymorphism to allow a general LibraryItem reference to manage all items, regardless of type.
*/

public abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    private boolean isAvailable = true;  // Encapsulation of item availability

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Encapsulation (getters & setters)
    public String getItemId() { return itemId; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { this.isAvailable = available; }

    // Abstract method
    public abstract int getLoanDuration();

    // Concrete method
    public void getItemDetails() {
        System.out.println("ID: " + itemId + " | Title: " + title + " | Author: " + author + 
                           " | Available: " + (isAvailable ? "Yes" : "No"));
    }
}


