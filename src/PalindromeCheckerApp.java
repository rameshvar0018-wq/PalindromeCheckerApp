import java.util.Scanner;

class PalindromeChecker {

    public boolean checkPalindrome(String input) {
        String reverse = "";

        for(int i = input.length() - 1; i >= 0; i--) {
            reverse = reverse + input.charAt(i);
        }

        if(input.equalsIgnoreCase(reverse)) {
            return true;
        } else {
            return false;
        }
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        PalindromeChecker pc = new PalindromeChecker();

        boolean result = pc.checkPalindrome(input);

        if(result)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}