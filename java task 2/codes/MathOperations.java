import java.util.Scanner;

public class MathOperations {
    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public static double add(double a, double b) {
        return a + b;
    }

    // Method to add an integer and a double
    public static double add(int a, double b) {
        return a + b;
    }

    // Demonstrate the usage of overloaded methods with user input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting user input for two integers
        System.out.print("Enter an integer (a): ");
        int aInt = scanner.nextInt();

        System.out.print("Enter another integer (b): ");
        int bInt = scanner.nextInt();

        // Adding two integers
        int resultInt = add(aInt, bInt);
        System.out.println("Sum of integers: " + resultInt);

        // Getting user input for two doubles
        System.out.print("\nEnter a double (a): ");
        double aDouble = scanner.nextDouble();

        System.out.print("Enter another double (b): ");
        double bDouble = scanner.nextDouble();

        // Adding two doubles
        double resultDouble = add(aDouble, bDouble);
        System.out.println("Sum of doubles: " + resultDouble);

        // Getting user input for an integer and a double
        System.out.print("\nEnter an integer (a): ");
        int aMixed = scanner.nextInt();

        System.out.print("Enter a double (b): ");
        double bMixed = scanner.nextDouble();

        // Adding an integer and a double
        double resultMixed = add(aMixed, bMixed);
        System.out.println("Sum of integer and double: " + resultMixed);

        // Close the scanner
        scanner.close();
    }
}
