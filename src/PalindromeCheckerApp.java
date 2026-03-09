import java.util.Scanner;



public class PalindromeCheckerApp {

    /**
     * Application entry point for UC11.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        boolean result = PalindromeUtil.isPalindrome(input);

        System.out.println("Is Palindrome? : " + result);

        scanner.close();
    }
}

/**
 * Utility class for palindrome operations.
 */
class PalindromeUtil {

    /**
     * Determines whether the input string is a palindrome.
     *
     * @param text Input string
     * @return true if palindrome, otherwise false
     */
    public static boolean isPalindrome(String text) {

        // initialize pointers
        int start = 0;
        int end = text.length() - 1;

        // compare characters moving inward
        while (start < end) {

            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}