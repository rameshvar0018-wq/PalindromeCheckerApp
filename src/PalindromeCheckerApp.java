public class PalindromeCheckerApp {






        public static void main(String[] args) {

            String input = "civic";

            char[] stack = new char[input.length()];
            char[] queue = new char[input.length()];

            int top = -1;
            int front = 0;
            int rear = -1;

            // Insert characters into stack and queue
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                stack[++top] = c;     // push
                queue[++rear] = c;    // enqueue
            }

            boolean isPalindrome = true;

            // Compare stack pop and queue dequeue
            for (int i = 0; i < input.length(); i++) {

                char fromStack = stack[top--];   // pop
                char fromQueue = queue[front++]; // dequeue

                if (fromStack != fromQueue) {
                    isPalindrome = false;
                    break;
                }
            }

            System.out.println("Input : " + input);
            System.out.println("Is Palindrome? : " + isPalindrome);
        }
    }