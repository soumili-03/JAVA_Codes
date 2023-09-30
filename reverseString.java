import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = reverse(input);

        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }

    public static String reverse(String input) {
        int length = input.length();
        StringBuilder reversed = new StringBuilder();

        // Iterate through the characters of the input string in reverse order
        for (int i = length - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        return reversed.toString();
    }
}

