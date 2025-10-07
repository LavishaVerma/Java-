import java.util.Scanner;

public class PatternPrinting {
    public static void main(String[] args) {
    
        System.out.println("name: Lavisha Verma\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        // 1. Pyramid Pattern
        System.out.println("\nPyramid Pattern:");
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");  // spaces
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2. Left Triangle Pattern
        System.out.println("\nLeft Triangle Pattern:");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 3. Right Triangle Pattern
        System.out.println("\nRight Triangle Pattern:");
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");  // spaces
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
