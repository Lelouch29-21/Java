package Arrays;

import java.util.HashSet;
import java.util.Set;

public class one { // Class names should start with an uppercase letter
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 2}; // Example array
        one one = new one(); // Create an instance of the class
        boolean hasDuplicate = one.hasDuplicate(nums); // Call the method
        System.out.println("Has duplicate: " + hasDuplicate); // Print the result
    }

    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}