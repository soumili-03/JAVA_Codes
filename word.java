import java.util.Scanner;

public class word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.next(); // Read a single word

        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter a line of text: ");
        String line = scanner.nextLine(); // Read the entire line of text

        String result = word + " " + line; // Concatenate the word and the line with a space in between

        System.out.println("Combined result: " + result);

        scanner.close();
    }
}
