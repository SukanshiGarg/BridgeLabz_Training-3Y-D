
public class ques4 {

    public static void generateException() {
        String text = null; 
        System.out.println("Length of text: " + text.length());
    }

    public static void handleException() {
        String text = null;
        try {
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Cannot call method on null");
        } finally {
            System.out.println("Finally block executed: Cleaning up if needed.");
        }
    }

    public static void main(String[] args) {
        handleException();
    }
}