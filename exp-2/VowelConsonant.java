import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        
        System.out.println("name: Lavisha Verma\n");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a letter: ");
        char ch = sc.next().toLowerCase().charAt(0);

   
        if (ch >= 'a' && ch <= 'z') {
            // Check vowels
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input! Please enter an alphabet.");
        }

        sc.close();
    }
}
