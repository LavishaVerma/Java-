import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class SimpleReadWrite {
    public static void main(String[] args) {
        System.out.print("Lavisha 24csu314");
        String filename = "sample.txt";

        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Hello, this is a simple file write example.");
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing the file.");
        }

        try (FileReader reader = new FileReader(filename)) {
            int ch;
            System.out.println("Reading from file:");
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
        }
    }
}