public class ExceptionExample {
    public static void main(String[] args) {
        System.out.println("lAVISHA 24csu314");
        try {
            throw new Exception("This is a custom Exception message!");
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed successfully.");
        }
    }
}