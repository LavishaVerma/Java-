public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println("Program executed by: Lavisha Verma\n");

        int number = 753;  
        int digit1 = number / 100;        // first digit
        int digit2 = (number / 10) % 10;  // second digit
        int digit3 = number % 10;         // third digit

        // Sum 
        int sum = digit1 + digit2 + digit3;


        System.out.println("The sum of digits of " + number + " is: " + sum);
    }
}
