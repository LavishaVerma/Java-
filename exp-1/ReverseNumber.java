public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("name: Lavisha Verma\n");

        
        int number = 753;  

        int digit1 = number / 100;        
        int digit2 = (number / 10) % 10;  
        int digit3 = number % 10;         
        int reversed = (digit3 * 100) + (digit2 * 10) + digit1;

       
        System.out.println("The reverse of " + number + " is: " + reversed);
    }
}
