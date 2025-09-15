public class LibraryDemo {
    public static void main(String[] args) {
        Author book1 = new Author(
            "Java Programming", 
            2023, 
            "James Gosling", 
            "Father of Java, created Java at Sun Microsystems."
        );

        Author book2 = new Author(
            "Clean Code", 
            2008, 
            "Robert C. Martin", 
            "Known as Uncle Bob, software engineer and author."
        );

        System.out.println("=== Book 1 Details ===");
        book1.displayInfo();

        System.out.println("\n=== Book 2 Details ===");
        book2.displayInfo();
    }
}
