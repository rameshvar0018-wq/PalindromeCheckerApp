public class PalindromeCheckerApp {


        public static void main(String[] args) {

            // Check if input is provided
            if (args.length == 0) {
                System.out.println("Please provide a string as a command-line argument.");
                return;
            }

            String input = args[0];
            String reversed = "";

            // Iterate from the last character to the first
            for (int i = input.length() - 1; i >= 0; i--) {
                reversed += input.charAt(i);
            }

            // Compare original and reversed strings
            if (input.equals(reversed)) {
                System.out.println(input + " is a Palindrome.");
            } else {
                System.out.println(input + " is not a Palindrome.");
            }
        }
    }