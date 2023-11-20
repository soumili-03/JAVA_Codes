public class PrimeNumbers {
    public static void main(String[] args) {
        int count = 0; // Counter to keep track of the number of prime numbers found
        int number = 2; // Start checking for prime numbers from 2

        System.out.println("First 10 Prime Numbers:");

        while (count < 10) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }

    // Method to check if a number is prime
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        // Check for factors up to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If the number has a factor, it is not prime
            }
        }

        return true; // If no factors are found, the number is prime
    }
}
