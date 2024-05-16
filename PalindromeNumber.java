import java.util.Scanner;

public class PalindromeNumber {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            scanner.close();

            if(isPalindrome(number))
                System.out.println(number + " is a palindrome.");
            else
                System.out.println(number + " is not a palindrome.");
        }

        // Function to check if a number is a palindrome
        public static boolean isPalindrome(int number) {
            int reversedNumber = 0;
            int originalNumber = number;

            // Reverse the number
            while(number != 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }

            // Check if the reversed number is equal to the original number
            return originalNumber == reversedNumber;
        }
}
