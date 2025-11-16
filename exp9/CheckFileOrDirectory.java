import java.io.File;
import java.util.Scanner;

public class CheckFileOrDirectory {
    public static void main(String[] args) {
        System.out.println("Lavisha 24csu314");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file or directory name: ");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        if (file.exists()) {
            if (file.isFile()) {
                System.out.println(file.getName() + " is a file.");
            } else if (file.isDirectory()) {
                System.out.println(file.getName() + " is a directory.");
            }
        } else {
            System.out.println("The file or directory does not exist.");
        }

        sc.close();
    }
}