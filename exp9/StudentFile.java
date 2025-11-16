import java.io.*;

public class StudentFile {
    public static void main(String[] args) {
        System.out.println("Lavisha 24csu314");
        String fileName = "students.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write("SerialNo\tFirstName\tCGPA\tGrade\n");
            bw.write("1\tJohn\t3.8\tA\n");
            bw.write("2\tMary\t3.5\tB\n");
            bw.write("3\tAlex\t3.9\tA\n");
            System.out.println("Data written successfully!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        System.out.println("\nReading data from file:");
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}