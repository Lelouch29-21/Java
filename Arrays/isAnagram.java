package Arrays;
import java.util.*;

public class isAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> countMap = new HashMap<>();

        // Increment counts for characters in s
        for (int i = 0; i < s.length(); i++) {
            countMap.put(s.charAt(i), countMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        // Decrement counts for characters in t
        for (int i = 0; i < t.length(); i++) {
            countMap.put(t.charAt(i), countMap.getOrDefault(t.charAt(i), 0) - 1);
        }

        // Check if all counts are zero
        for (int count : countMap.values()) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    // Main method to test the isAnagram function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        isAnagram anagramChecker = new isAnagram();

        System.out.println("Enter the first string:");
        String s = scanner.nextLine();

        System.out.println("Enter the second string:");
        String t = scanner.nextLine();

        boolean result = anagramChecker.isAnagram(s, t);
        System.out.println("Are '" + s + "' and '" + t + "' anagrams? " + result);

        scanner.close();
    }
}