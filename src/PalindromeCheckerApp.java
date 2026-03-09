
import java.util.ArrayDeque;
import java.util.Deque;
public class PalindromeCheckerApp {
    public static void main(String[] args) {

            // Define the input string
            String input = "radar";

            // Create a Deque to store characters
            Deque<Character> deque = new ArrayDeque<>();

            // Add each character to the deque
            for (char c : input.toCharArray()) {
                deque.addLast(c);
            }

            // Assume it is palindrome
            boolean isPalindrome = true;

            // Continue comparison while more than one element exists
            while (deque.size() > 1) {

                char first = deque.removeFirst();
                char last = deque.removeLast();

                if (first != last) {
                    isPalindrome = false;
                    break;
                }
            }

            // Print result
            System.out.println("Palindrome : " + isPalindrome);
        }
    }




