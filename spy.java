import java.util.Scanner;

public class spy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isSpyNumber = isSpy(number);

        if (isSpyNumber) {
            System.out.println(number + " is a Spy Number.");
        } else {
            System.out.println(number + " is not a Spy Number.");
        }

        scanner.close();
    }

    public static boolean isSpy(int number) {
        int sumOfDigits = 0;
        int productOfDigits = 1;

        // Calculate the sum and product of digits
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            sumOfDigits += digit;
            productOfDigits *= digit;
            number /= 10; // Remove the last digit
        }

        return sumOfDigits == productOfDigits;
    }
}
