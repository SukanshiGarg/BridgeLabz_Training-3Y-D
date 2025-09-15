public class Author extends Book {
    private String name;
    private String bio;

    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // call parent constructor
        this.name = name;
        this.bio = bio;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // show book details
        System.out.println("Author Name: " + name);
        System.out.println("Bio: " + bio);
    }
}
