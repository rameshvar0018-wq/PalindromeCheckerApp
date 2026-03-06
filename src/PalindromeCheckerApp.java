public class PalindromeCheckerApp {






        public static void main(String[] args) {

            String input = "noon";

            char[] stack = new char[input.length()];
            int top = -1;

            // Push characters into stack
            for (int i = 0; i < input.length(); i++) {
                stack[++top] = input.charAt(i);
            }

            boolean isPalindrome = true;

            // Pop and compare
            for (int i = 0; i < input.length(); i++) {
                char popped = stack[top--];

                if (input.charAt(i) != popped) {
                    isPalindrome = false;
                    break;
                }
            }

            System.out.println("Input : " + input);
            System.out.println("Is Palindrome? : " + isPalindrome);
        }
    }