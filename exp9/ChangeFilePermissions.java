import java.io.File;

public class ChangeFilePermissions {
    public static void main(String[] args) {
        System.out.println("Lavisha 24csu314");
        File file = new File("ex.txt");

        if (file.exists()) {
            file.setReadable(true);
            file.setWritable(true);
            file.setExecutable(false);
            System.out.println("File permissions updated successfully!");
        } else {
            System.out.println("File not found!");
        }
    }
}