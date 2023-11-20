import java.util.Scanner;

public class BankAccount {
    private int accountNumber;
    private double balance;

    // Constructor to initialize the account with an account number and balance
    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Constructor with a default balance of 0.0
    public BankAccount(int accountNumber) {
        this(accountNumber, 0.0);
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rs." + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the first account
        System.out.print("Enter Account Number for Account 1: ");
        int accountNumber1 = scanner.nextInt();

        System.out.print("Enter Initial Balance for Account 1: Rs.");
        double balance1 = scanner.nextDouble();

        // Create the first instance of BankAccount
        BankAccount account1 = new BankAccount(accountNumber1, balance1);

        // Get user input for the second account
        System.out.print("\nEnter Account Number for Account 2: ");
        int accountNumber2 = scanner.nextInt();

        // Create the second instance of BankAccount with default balance
        BankAccount account2 = new BankAccount(accountNumber2);

        // Display account details
        System.out.println("\nAccount 1 Details:");
        account1.displayAccountDetails();

        System.out.println("\nAccount 2 Details:");
        account2.displayAccountDetails();

        // Close the scanner
        scanner.close();
    }
}
