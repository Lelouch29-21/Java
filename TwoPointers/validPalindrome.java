package TwoPointers;

import java.util.Scanner;

public class validPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check if it is a valid palindrome:");
        String s = scanner.nextLine();

        validPalindrome checker = new validPalindrome();
        boolean result = checker.isPalindrome(s);

        if (result) {
            System.out.println("The string is a valid palindrome.");
        } else {
            System.out.println("The string is not a valid palindrome.");
        }

        scanner.close();
    }

    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            // Skip non-alphanumeric characters from the left
            while (l < r && !alphaNum(s.charAt(l))) {
                l++;
            }
            // Skip non-alphanumeric characters from the right
            while (r > l && !alphaNum(s.charAt(r))) {
                r--;
            }
            // Compare characters (case-insensitive)
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public boolean alphaNum(char c) {
        // Check if the character is alphanumeric
        return (c >= 'A' && c <= 'Z' || 
                c >= 'a' && c <= 'z' || 
                c >= '0' && c <= '9');
    }
}