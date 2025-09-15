/*
 Interface for Library Management System (Problem 5)
 Provides reserving and availability functionalities.
*/

public interface Reservable {
    void reserveItem(String borrower);
    void checkAvailability();
}

