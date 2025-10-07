public class QuadraticRoots {
    public static void main(String[] args) {
        // Print your name
        System.out.println("Program executed by: Lavisha Verma\n");

        // Coefficients of the quadratic equation
        double a = 1, b = -3, c = 2;  // Example: x² - 3x + 2 = 0

        // Calculate discriminant
        double discriminant = b * b - 4 * a * c;

        // Check conditions for roots
        if (discriminant > 0) {
            // Two real and distinct roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are real and distinct:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (discriminant == 0) {
            // One real and repeated root
            double root = -b / (2 * a);
            System.out.println("The roots are real and equal:");
            System.out.println("Root = " + root);
        } else {
            // Complex roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("The roots are complex:");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }
    }
}
