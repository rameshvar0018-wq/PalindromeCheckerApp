
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Define the input string
        String input = "level";

        // Create a deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to the deque
        for (char c : input.toLowerCase().toCharArray()) {
            deque.addLast(c);
        }

        // Assume it is a palindrome
        boolean isPalindrome = true;

        // Compare until only one or zero elements remain
        while (deque.size() > 1) {

            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}